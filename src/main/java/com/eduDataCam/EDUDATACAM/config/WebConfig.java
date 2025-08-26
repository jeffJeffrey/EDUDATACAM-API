package com.eduDataCam.EDUDATACAM.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(@SuppressWarnings("null") CorsRegistry registry) {
        registry.addMapping("/**")
                        .allowedOrigins("http://localhost:3000", "http://192.168.0.146:3000", "https://edudatacam-app.vercel.app")  // Ajoutez l'origine de votre frontend
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD", "OPTIONS");

    }

}
