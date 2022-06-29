package com.shd.springdata.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.shd.springdata.entity.base.BaseModel;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "product")
@Getter
@Setter
public class Product extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3230053406390637512L;
	@Id
	private String productCode;
	private String productName;
	@ManyToOne
	private ProductLines productLine;
	private String productScale;
	private String productVendor;
	private String productDescription;
	private String productInStock;
	private String buyPrice;
	private String MSRP;
	
}
