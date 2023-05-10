package org.example;

import com.mercadolibre.fbm.rest.GetClientService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableAsync;

@EntityScan(
        basePackageClasses = {PatternDesignsApplication.class}
)
@SpringBootApplication
@EnableAsync
public class PatternDesignsApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(PatternDesignsApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(PatternDesignsApplication.class);
    }
}