package com.shd.springdata.dto;

import com.shd.springdata.entity.Employees;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomersDto {
	private int customerNumber;
	private String customerName;
	private String constactLastName;
	private String contactFirstName;
	private String phone;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	private Employees salesRepEmployeeNumber;
	private Double creditLimit; 
}
