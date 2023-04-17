package com.hjl.learn.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan({"com.hjl.learn"})
@EnableTransactionManagement
public class SpringConfig {
}
