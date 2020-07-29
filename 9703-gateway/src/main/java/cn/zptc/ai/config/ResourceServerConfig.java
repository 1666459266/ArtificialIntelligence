package cn.zptc.ai.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;

@Configuration
public class ResourceServerConfig {
    //配置资源的ID
    public static final String RESOURCE_ID = "resource";

    @Autowired
    private TokenStore tokenStore;

    //认证授权资源服务配置
    @Configuration
    @EnableResourceServer
    public class AuthenticationAuthorizationServiceConfig extends ResourceServerConfigurerAdapter{
        @Override
        public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
            resources.resourceId(RESOURCE_ID)//资源ID
                    .tokenStore(tokenStore)
                    .stateless(true);
        }

        @Override
        public void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests()
                    .antMatchers("/authentication-authorization/**").permitAll();
        }
    }

    //user资源服务配置
    @Configuration
    @EnableResourceServer
    public class UserServiceConfig extends ResourceServerConfigurerAdapter{
        @Override
        public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
            resources.resourceId(RESOURCE_ID)//资源ID
                    .tokenStore(tokenStore)
                    .stateless(true);
        }

        @Override
        public void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests()
                    .antMatchers("/user/**").access("#oauth2.hasScope('ALL')");
        }
    }

    //column资源服务配置
    @Configuration
    @EnableResourceServer
    public class ColumnServiceConfig extends ResourceServerConfigurerAdapter{
        @Override
        public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
            resources.resourceId(RESOURCE_ID)//资源ID
                    .tokenStore(tokenStore)
                    .stateless(true);
        }

        @Override
        public void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests()
                    .antMatchers("/column/**").access("#oauth2.hasScope('ALL')");
        }
    }

    //special资源服务配置
    @Configuration
    @EnableResourceServer
    public class SpecialServiceConfig extends ResourceServerConfigurerAdapter{
        @Override
        public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
            resources.resourceId(RESOURCE_ID)//资源ID
                    .tokenStore(tokenStore)
                    .stateless(true);
        }

        @Override
        public void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests()
                    .antMatchers("/special/**").access("#oauth2.hasScope('ALL')");
        }
    }

    //website资源服务配置
    @Configuration
    @EnableResourceServer
    public class WebsiteServiceConfig extends ResourceServerConfigurerAdapter{
        @Override
        public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
            resources.resourceId(RESOURCE_ID)//资源ID
                    .tokenStore(tokenStore)
                    .stateless(true);
        }

        @Override
        public void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests()
                    .antMatchers("/website/**").access("#oauth2.hasScope('ALL')");
        }
    }

    //article资源服务配置
    @Configuration
    @EnableResourceServer
    public class ArticleServiceConfig extends ResourceServerConfigurerAdapter{
        @Override
        public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
            resources.resourceId(RESOURCE_ID)//资源ID
                    .tokenStore(tokenStore)
                    .stateless(true);
        }

        @Override
        public void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests()
                    .antMatchers("/article/**").access("#oauth2.hasScope('ALL')");
        }
    }

    //link资源服务配置
    @Configuration
    @EnableResourceServer
    public class LinkServiceConfig extends ResourceServerConfigurerAdapter{
        @Override
        public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
            resources.resourceId(RESOURCE_ID)//资源ID
                    .tokenStore(tokenStore)
                    .stateless(true);
        }

        @Override
        public void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests()
                    .antMatchers("/link/**").access("#oauth2.hasScope('ALL')");
        }
    }
}
