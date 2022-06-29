package com.shd.springdata.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.shd.springdata.entity.base.BaseModel;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "productlines")
@Getter
@Setter
public class ProductLines extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1498728071820977286L;
	@Id
	private String productLine;
	private String textDescription;
	
	@Column(length = 1000)
	private String htmlDescription;
	
	@Lob
	private String image;
}
