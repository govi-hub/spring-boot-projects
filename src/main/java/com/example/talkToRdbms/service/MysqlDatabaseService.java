package com.example.talkToRdbms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.talkToRdbms.model.Car;
import com.example.talkToRdbms.repo.CarRepository;

@Service
public class MysqlDatabaseService {
	
	@Autowired
	private CarRepository carRepo;
	
	public List<Car> findByOwner(String owner) {
		return carRepo.findByOwner(owner);
	}
}
