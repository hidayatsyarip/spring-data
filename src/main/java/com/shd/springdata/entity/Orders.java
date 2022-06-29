package com.shd.springdata.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
@Table(name = "orders")
@Getter
@Setter
public class Orders extends BaseModel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 60907682791533559L;

	@Id
	@GeneratedValue
	private Integer orderNumber;
	
	@JsonSerialize(using = JsonSerializer.class)
	@JsonDeserialize(using = JsonDeserializer.class)
	private Date orderDate;
	

	@JsonSerialize(using = JsonSerializer.class)
	@JsonDeserialize(using = JsonDeserializer.class)
	private Date requiredDate;

	@JsonSerialize(using = JsonSerializer.class)
	@JsonDeserialize(using = JsonDeserializer.class)
	private Date shippedDate;
	
	private String Status;
	
	@Column(length = 1000)
	private String comments;
	
	@ManyToOne
	private Customers customer;
}
