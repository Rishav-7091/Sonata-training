package com.sonata.MyService;

import java.util.Arrays;
import java.util.List;

import com.example.demos.MyServiceIntf;

public class MyServiceStub implements MyServiceIntf{

	@Override
	public List<String> retrieveUser(String user) {
		// TODO Auto-generated method stub
		return Arrays.asList("Learn Spring MVC","Learn Spring","Learn to Dance");
	}
	
	

}
