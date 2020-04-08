package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String getHello()
	{
		System.out.println("hello");
		return "hello";
	}
	
	@RequestMapping(value = "/nihao", method = RequestMethod.GET)
	public String getNihao()
	{
		System.out.println("nihao");
		return "nihao";
	}
}
