package com.milistock.develop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// @Configuration
// public class TaeyonConfig implements WebMvcConfigurer {
    
//     @Override
//     public void addCorsMappings(CorsRegistry registry) {
//         registry.addMapping("/**")
//             .allowedOrigins("*") // Allow requests from any origin
//             .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Allowed HTTP methods
//             .allowedHeaders("*") // Allowed request headers
//             .allowCredentials(true); // Allow cookies/authentication headers
//     }
// }