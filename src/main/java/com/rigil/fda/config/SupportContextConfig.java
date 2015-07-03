package com.rigil.fda.config;

import com.rigil.fda.support.SearchEnterpriseDocumentSupport;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class SupportContextConfig {

    @Bean
    public SearchEnterpriseDocumentSupport searchEnterpriseDocumentSupport(){
        return new SearchEnterpriseDocumentSupport();
    }

}
