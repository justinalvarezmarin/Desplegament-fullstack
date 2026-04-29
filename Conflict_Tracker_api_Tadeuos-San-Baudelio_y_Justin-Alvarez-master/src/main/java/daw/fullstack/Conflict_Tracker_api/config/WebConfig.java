package daw.fullstack.Conflict_Tracker_api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                // Esto va dentro de tu código Java en Railway
                .allowedOrigins("https-github-com-justinalvarezmarin.vercel.app")
                .allowedOrigins("https://https-github-com-justinalvarezmarin-desplegament-319u18kf5.vercel.app")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*");
    }
}