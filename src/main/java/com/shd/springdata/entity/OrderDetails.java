package com.shd.springdata.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.shd.springdata.entity.base.BaseModel;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "orderdetails")
@Getter
@Setter
public class OrderDetails extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4645321582324743731L;

	@Id
	@ManyToOne
	private Orders orderNumber;

	@ManyToOne
	private Product productCode;
	
	private Integer quantityOrdered;
	private Double priceEach;
	private Integer orderLineNumber;
}
