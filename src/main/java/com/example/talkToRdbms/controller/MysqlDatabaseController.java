package com.example.talkToRdbms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.talkToRdbms.model.Car;
import com.example.talkToRdbms.service.MysqlDatabaseService;

@RestController
@RequestMapping("assets")
public class MysqlDatabaseController {
	
	@Autowired
	MysqlDatabaseService mysqlDatabaseService;
	
	@GetMapping(value = "/cars/{name}")
	public List<Car> getCarsData(@PathVariable String name) {
		return mysqlDatabaseService.findByOwner(name);
	}

}
