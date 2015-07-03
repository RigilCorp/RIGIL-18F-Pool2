package com.rigil.fda.config;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(value = { "classpath:spring/common-context.xml" })
public class BeanContextConfig {

    @Value("${date.format}")
    private String dateFormat;

    @Bean(name="dateFormatter")
    public SimpleDateFormat createSimpleDateFormat(){
        return new SimpleDateFormat(dateFormat);
    }

}
