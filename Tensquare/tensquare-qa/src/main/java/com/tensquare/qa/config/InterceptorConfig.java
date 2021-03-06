package com.tensquare.qa.config;

import com.tensquare.qa.interceptor.JwtInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @program: tensquare-parent
 * @Date: 2019-4-1 18:16
 * @Author: 846602483
 * @Description:
 */
@Configuration
public class InterceptorConfig extends WebMvcConfigurationSupport {

    @Autowired
    private JwtInterceptor jwtInterceptor;
     @Override
    protected void addInterceptors(InterceptorRegistry registry){

         //注册拦截器要声明拦截器对象和要拦截的请求
         registry.addInterceptor(jwtInterceptor)
                 .addPathPatterns("/**")
                 .excludePathPatterns("/**/login/**");




     }

}
