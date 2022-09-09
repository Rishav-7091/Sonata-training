package com.example.demos;

import java.util.ArrayList;
import java.util.List;

public class MyServiceImpla {
	

		private MyServiceIntf myService;
		
		MyServiceImpla(){}
		public MyServiceImpla(MyServiceIntf mySer){
			this.myService = mySer;
		}
		
		public List<String> retriveRelated(String user){
			List <String> filteredValue = new ArrayList<String>();
			List<String> allToDo = myService.retrieveUser(user);
			for (String all : allToDo) {
				if(all.contains("Spring")) {
					filteredValue.add(all);
				}
			}
			return filteredValue;
		}
	}

