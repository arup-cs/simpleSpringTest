package com.example.springDemo.practice;

import com.example.springDemo.template.MobilePhone;
import com.example.springDemo.template.Tablet;

public class PracticeMainPackage {
	public void runPractice() {
		System.out.println("\n\n\n Running Practice");
		
		MobilePhone phone1 = new MobilePhone("Samsung", 64, "Sony");
		MobilePhone phone2 = new MobilePhone("Apple", 128, "Sony");
		
		Tablet tablet1 = new Tablet("Asus", 256, "hp");
		
		System.out.println("First object Screen"+ phone1.getScreen());
		
		tablet1.callingFunction();//Mobile phone
		tablet1.textingFunction();//MObile phone
		tablet1.internetBrowsing();// tablet
	
	
	
	
	
	
	
	
	
	}

}
