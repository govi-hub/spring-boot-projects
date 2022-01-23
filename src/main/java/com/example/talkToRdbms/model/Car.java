package com.example.talkToRdbms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
public class Car {
	
	@Id
	@Column
	private Integer id;
	@Column
	private String make;
	@Column
	private String model;
	@Column
	private String year;
	@Column
	private String body;
	@Column
	private String owner;
}
