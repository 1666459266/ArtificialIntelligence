package cn.zptc.ai.filter;

import com.alibaba.fastjson.JSON;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.OAuth2Request;

import java.io.UnsupportedEncodingException;
import java.util.*;

public class AuthFilter extends ZuulFilter {
    //在请求之前拦截
    @Override
    public String filterType() {
        return "pre";
    }

    //优先级
    @Override
    public int filterOrder() {
        return 0;
    }

    //请求必须过滤
    @Override
    public boolean shouldFilter() {
        return true;
    }

    //获取当前用户的身份信息和权限信息
    //把身份信息和和权限信息放入json 放入http的header中
    //转发给微服务
    @Override
    public Object run() throws ZuulException {
        //获取令牌内容
        RequestContext currentContext = RequestContext.getCurrentContext();
        //从安全的上下文中拿到用户身份对象
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof OAuth2Authentication)){
            return null;
        }
        OAuth2Authentication oAuth2Authentication = (OAuth2Authentication) authentication;
        Authentication userAuthentication = oAuth2Authentication.getUserAuthentication();
        //获取用户身份
        String principal = userAuthentication.getName();
        //获取用户权限
        List<String> authorities = new ArrayList<>();
        //从userAuthentication取出权限放在authorities
        userAuthentication.getAuthorities().stream().forEach(c -> authorities.add(c.getAuthority()));
        OAuth2Request oAuth2Request = oAuth2Authentication.getOAuth2Request();
        Map<String, String> requestParameters = oAuth2Request.getRequestParameters();
        Map<String,Object> jsonToken = new HashMap<>(requestParameters);
        if (userAuthentication != null){
            jsonToken.put("principal",principal);
            jsonToken.put("authorities",authorities);
        }
        //把身份信息和和权限信息放入json 放入http的header中 转发给微服务
        currentContext.addZuulRequestHeader("json-token", encodeUTF8StringBase64(JSON.toJSONString(jsonToken)));
        return null;
    }

    public static String encodeUTF8StringBase64(String str){
        String encoded = null;
        try {
            encoded = Base64.getEncoder().encodeToString(str.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return encoded;
    }
}
