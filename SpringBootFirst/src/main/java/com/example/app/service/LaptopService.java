package com.example.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.model.Laptop;
import com.example.app.repo.LaptopRepository;

@Service
public class LaptopService {
	@Autowired
	private LaptopRepository repo;
	
	public void addLaptop(Laptop lap) {
		repo.saveLaptop(lap);
	}
	public boolean checkLap(Laptop lap) {
		return true;
	}
}
