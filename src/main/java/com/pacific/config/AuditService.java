/**
 * 
 */
package com.pacific.config;

import java.io.IOException;
import java.nio.charset.Charset;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Service;
import org.springframework.util.StreamUtils;

/**
 * @author AC58826
 *
 */
@Service
public class AuditService {

	private final Logger log = LoggerFactory.getLogger(AuditService.class);

	public void auditRequest(HttpRequest request, ClientHttpResponse response, byte[] body) throws IOException {

		log.debug("========Audit started for request and response from rest Template calls======");
		log.debug("Service URI : {}", request.getURI());
		log.debug("Request Method : {}", request.getMethod());
		log.debug("Headers: {}", request.getHeaders());
		log.debug("Request body: {}", new String(body, "UTF-8"));

		log.debug("Response Status code: {}", response.getStatusCode());
		log.debug("Response Status text: {}", response.getStatusText());
		log.debug("Response body: {}", StreamUtils.copyToString(response.getBody(), Charset.defaultCharset()));

		log.debug("========End of request and response audit======");

	}
}
