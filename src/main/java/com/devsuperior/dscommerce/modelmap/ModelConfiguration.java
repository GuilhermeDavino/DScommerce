package com.devsuperior.dscommerce.modelmap;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelConfiguration {
    @Bean
    ModelMapper getModelMap() {
		return new ModelMapper();
	}
}
