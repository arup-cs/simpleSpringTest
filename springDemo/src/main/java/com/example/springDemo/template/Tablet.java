package com.example.springDemo.template;

public class Tablet extends MobilePhone {

	public Tablet(String screen, int memory, String camera) {
		super(screen, memory, camera);
		
	}
	
	//function
	public void internetBrowsing() {
		System.out.println(" internet Browsing invoked");
	}
	
}
