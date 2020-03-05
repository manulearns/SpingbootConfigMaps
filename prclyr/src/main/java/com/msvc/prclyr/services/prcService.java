package com.msvc.prclyr.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


@Configuration
@Service
public class prcService {
	
	@Value("${intlyrurl}")
	private String url1;
	
	public String callIntSvc(String inpStr)
	{
		System.out.println("URL value is : "+ url1);
		RestTemplate restTemplate = new RestTemplate();			
	    List<MediaType> acceptableMediaTypes = new ArrayList<MediaType>();
	    acceptableMediaTypes.add(MediaType.TEXT_PLAIN);

	    HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(acceptableMediaTypes);
	    
	    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
	    
	    System.out.println("Got a new request. Before sending HTTP");
	    UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(url1)
                .queryParam("name", inpStr); 
	    
	    ResponseEntity<String> result = restTemplate.exchange(uriBuilder.toUriString(), HttpMethod.GET, entity, String.class);
		System.out.println("after HTTP Response");
		return result.getBody();

	}
	
}
