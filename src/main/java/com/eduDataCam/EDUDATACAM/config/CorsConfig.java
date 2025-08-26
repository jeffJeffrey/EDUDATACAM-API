// package com.eduDataCam.EDUDATACAM.config;

// import java.util.Arrays;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.web.cors.CorsConfiguration;
// import org.springframework.web.cors.reactive.CorsWebFilter;
// import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

// @Configuration
// public class CorsConfig {
//     @Bean
//     public CorsWebFilter corsWebFilter() {
//         CorsConfiguration corsConfig = new CorsConfiguration();
//         corsConfig.setAllowedOrigins(Arrays.asList("http://localhost:3000"));
//         corsConfig.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
//         corsConfig.setAllowedHeaders(Arrays.asList("*"));
//         corsConfig.setAllowCredentials(true);
//         corsConfig.setMaxAge(3600L);

//         UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//         source.registerCorsConfiguration("/**", corsConfig);

//         return new CorsWebFilter(source);
//     }

// }
