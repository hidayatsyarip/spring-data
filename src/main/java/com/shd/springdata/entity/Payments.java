package com.shd.springdata.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.shd.springdata.entity.base.BaseModel;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "payments")
@Getter
@Setter
public class Payments extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7511377108748462336L;

	@Id
	@ManyToOne
	private Customers customerNumber;
	
	private String checkNumber;
	
	@JsonSerialize(using = JsonSerializer.class)
	@JsonDeserialize(using = JsonDeserializer.class)
	private Date paymentDate;
	private Double amount;
}
