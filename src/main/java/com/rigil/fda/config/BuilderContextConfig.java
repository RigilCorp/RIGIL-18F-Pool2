package com.rigil.fda.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rigil.fda.builder.SearchResultsBuilder;

@Configuration
public class BuilderContextConfig {

    @Bean
    public SearchResultsBuilder userBuilder(){
        return new SearchResultsBuilder();
    }

}
