package com.example.app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
	public void code() {
		System.out.println("Compiling using Laptop......");
	}
}
