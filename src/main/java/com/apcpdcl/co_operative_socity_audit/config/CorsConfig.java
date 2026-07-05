package com.apcpdcl.co_operative_socity_audit.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:5173")
                .allowedMethods("POST","PUT","PATCH","GET","DELETE","OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true);
    }

}
