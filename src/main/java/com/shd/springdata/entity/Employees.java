package com.shd.springdata.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.shd.springdata.entity.base.BaseModel;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employees")
@Getter
@Setter
public class Employees extends BaseModel {

	private static final long serialVersionUID = -7794305096081161594L;
	@Id
	@GeneratedValue
	private Integer employeeNumber;
	private String lastName;
	private String fisrtName;
	private String extension;
	private String email;
	@ManyToOne
	private Offices officeCode;
	@ManyToOne
	private Employees reportsTo;
	private String jobTitle;
}
