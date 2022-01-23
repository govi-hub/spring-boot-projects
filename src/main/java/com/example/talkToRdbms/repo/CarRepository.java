package com.example.talkToRdbms.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.talkToRdbms.model.Car;

@Repository
public interface CarRepository extends CrudRepository<Car, Integer>{
	
	List<Car> findByOwner(String owner);

}
