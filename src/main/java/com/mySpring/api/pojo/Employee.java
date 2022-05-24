package com.mySpring.api.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {
	@Id
	@GeneratedValue
	int eId;
	String eName;
	String eAge;
	String eEmail;
}
