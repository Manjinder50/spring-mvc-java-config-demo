package com.timbuchalka.springdemo.config;

import javax.persistence.PersistenceContexts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;


@Configuration
@ComponentScan("com.timbuchalka.springdemo")
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {

	@Bean
	public UrlBasedViewResolver urlBasedViewResolver(){
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
		resolver.setPrefix("/WEB-INF/views");
		resolver.setPrefix(".jsp");
		resolver.setViewClass(JstlView.class);
		return resolver;
	}
	
}
