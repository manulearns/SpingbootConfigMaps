package com.msvc.prclyr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.msvc.prclyr.services.prcService;

@RestController
public class prcController {
	
	@Autowired
	prcService prcSvc; 
	
	@CrossOrigin("*")
	@GetMapping("/")
	public @ResponseBody String getPrcReq(@RequestBody String reqStr)
	{
		System.out.println("Got request "+ reqStr);
		String resp = prcSvc.callIntSvc(reqStr);
		return resp;
	}

}
