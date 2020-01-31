package com.example.springDemo.demoClasses;

public class MobilePhone {
	
	//Property
	private String screen;
	private int memory;
	private String camera;
	
	//Constructor --> Create the object
	public MobilePhone(String screen, int memory, String camera) {
		this.screen = screen;
		this.camera = camera;
		this.memory = memory;
		
	}
	
	
	//Functions
	public void callingFunction() {
		System.out.println(" Calling Function Invoked");
	}
	
	public void textingFunction() {
		System.out.println(" Texting Function Invoked");
	}

	
	
	//Auto generated Code
	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public String getCamera() {
		return camera;
	}

	public void setCamera(String camera) {
		this.camera = camera;
	}
	
	

}
