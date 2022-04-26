/**
 * 
 */
package com.pacific.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.pacific.interceptors.AuditInterceptor;

/**
 * @author AC58826
 *
 */
@Configuration
public class ResttemplateConfig {

	@Autowired
	public AuditInterceptor auditInterceptor;

	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		ClientHttpRequestFactory requestFactory = new BufferingClientHttpRequestFactory(
				new SimpleClientHttpRequestFactory());
		restTemplate.setRequestFactory(requestFactory);

		restTemplate.getInterceptors().add(auditInterceptor);

		return restTemplate;
	}

}
