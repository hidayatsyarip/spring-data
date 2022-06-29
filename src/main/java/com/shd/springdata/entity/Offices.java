package com.shd.springdata.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.shd.springdata.entity.base.BaseModel;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "offices")
@Getter
@Setter
public class Offices extends BaseModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7632200616601728485L;
	@Id
	private String officeCode;
	private String city;
	private String phone;
	private String addressLine1;
	private String addressLine2;
	private String state;
	private String country;
	private String postalCode;
	private String territory;
}
