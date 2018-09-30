package ru.nn.bankrot.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * Created by Parfenov on 29.09.2018
 */
public class AppInitializer extends AbstractDispatcherServletInitializer {


    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(WebMvcConfig.class);
        return applicationContext;
    }

    protected String[] getServletMappings() {
        return new String[]{"/api/*"};
    }

    protected WebApplicationContext createRootApplicationContext() {
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(AppConfig.class, HibernateConfig.class);
        return applicationContext;
    }
}
