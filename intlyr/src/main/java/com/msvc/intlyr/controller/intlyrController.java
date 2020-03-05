package com.msvc.intlyr.controller;

import java.nio.charset.Charset;
import java.util.Random;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class intlyrController {
	
	@CrossOrigin("*")
	@GetMapping("/")
	public @ResponseBody String retString(@RequestParam("name") String inp)
	{
		System.out.println("Got Message "+ inp );
		
		
		if (inp.isBlank() || inp.isEmpty() || inp == null)
		{	
		
		    byte[] array = new byte[7]; // length is bounded by 7
		    new Random().nextBytes(array);
		    inp = new String(array, Charset.forName("UTF-8"));
			
		}		
		return "Hello " + inp ;
	}
	

}
