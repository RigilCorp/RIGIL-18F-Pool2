package com.rigil.fda.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.rigil.common.config.BaseJndiDataBaseConfig;
import com.rigil.common.config.BaseJpaConfig;

@Configuration
@Import(value={
        BaseJndiDataBaseConfig.class,
        BaseJpaConfig.class,
        TransactionManagerConfig.class
})
public class RootContextConfig {



}
