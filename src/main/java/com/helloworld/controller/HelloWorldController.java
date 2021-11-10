package com.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
@RequestMapping("/Hello")

	public String sayHello()
	{
	System.out.println("inside hello method");    //logger

		return "Hello World";
	}



@RequestMapping("/Hi")
public String sayHi()
{
	System.out.println("Inside Hi Method");      //logger
    return "Hi";     
}
}