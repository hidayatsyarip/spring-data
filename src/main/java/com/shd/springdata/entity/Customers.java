package com.shd.springdata.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;

import com.fasterxml.jackson.annotation.JsonView;
import com.shd.springdata.entity.base.BaseModel;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "customers")
@Getter
@Setter
@JsonView(DataTablesOutput.View.class)
public class Customers extends BaseModel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6688304708861365826L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customerNumber;
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
	@ManyToOne
	private Employees salesRepEmployeeNumber;
	private Double creditLimit;
	
}



