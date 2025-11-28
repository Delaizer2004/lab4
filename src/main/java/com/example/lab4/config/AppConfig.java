package com.example.lab4.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan("com.example.lab4")
@EnableJpaRepositories("com.example.lab4.repository")
@EnableAspectJAutoProxy
public class AppConfig {
}
