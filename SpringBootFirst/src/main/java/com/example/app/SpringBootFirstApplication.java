package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.app.model.Alien;
import com.example.app.model.Laptop;
import com.example.app.service.LaptopService;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringBootFirstApplication.class, args);
		LaptopService service=context.getBean(LaptopService.class);
		Laptop lap=context.getBean(Laptop.class);
		service.addLaptop(lap);
		System.out.println(service.checkLap(lap));
		
//		Alien obj= context.getBean(Alien.class);
//		obj.display();
//		System.out.println(obj.getAge());
	}

}