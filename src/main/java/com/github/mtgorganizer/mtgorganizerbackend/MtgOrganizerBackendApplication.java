package com.github.mtgorganizer.mtgorganizerbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class}) // TODO
public class MtgOrganizerBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(MtgOrganizerBackendApplication.class, args);
    }
}
