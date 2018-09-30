package ru.nn.bankrot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by Parfenov on 29.09.2018
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"ru.nn.bankrot"})
public class WebMvcConfig implements WebMvcConfigurer {


}
