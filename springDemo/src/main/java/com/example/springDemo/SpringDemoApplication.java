package com.example.springDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.springDemo.demo.PracticeMainPackage;
import com.example.springDemo.demoClasses.MainPackage;

@SpringBootApplication
//@EnableAutoConfiguration
//@EnableJpaRepositories("com.example.springDemo.repository")
//@EntityScan("com.example.springDemo.domain")
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
		MainPackage mainPack = new MainPackage();
		mainPack.run();
		
		PracticeMainPackage practiceMainPack = new PracticeMainPackage();
		practiceMainPack.runPractice();
			
	}

}
