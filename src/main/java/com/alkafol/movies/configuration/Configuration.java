package com.alkafol.movies.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    ObjectMapper mapper() {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.registerModule(new JavaTimeModule());
    }
}
