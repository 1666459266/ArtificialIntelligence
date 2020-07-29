package cn.zptc.ai.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true) //开启@PreAuthorize
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    //密码编码器
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    //令牌访问端点的认证管理器
    @Bean
    public AuthenticationManager authenticationManager() throws Exception {
        return super.authenticationManager();
    }

    //安全拦截机制
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()//屏蔽CSRF控制 SpringSecurity不再限制CSRF
                .authorizeRequests()
                .antMatchers("/oauth/**").permitAll() //配置不拦截的路径
                .antMatchers("/**").authenticated() //其他请求都拦截
            .and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED);//会话控制管理
    }
}
