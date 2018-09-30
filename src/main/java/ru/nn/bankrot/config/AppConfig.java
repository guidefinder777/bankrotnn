package ru.nn.bankrot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Parfenov on 29.09.2018
 */
@Configuration
@ComponentScans(value = { @ComponentScan("ru.nn.bankrot") })
public class AppConfig {
}
