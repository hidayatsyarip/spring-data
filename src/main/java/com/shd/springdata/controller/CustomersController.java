package com.shd.springdata.controller;

import java.util.Optional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.shd.springdata.dto.CustomersDto;
import com.shd.springdata.entity.Customers;
import com.shd.springdata.repository.CustomersRepository;

@RestController
@RequestMapping("/rest/admin/masterdata/customer")
public class CustomersController {
	@Autowired  
	private CustomersRepository customersRepository;
	
	@JsonView(DataTablesOutput.View.class)
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public DataTablesOutput<Customers> list(@Valid DataTablesInput request) {
		DataTablesOutput<Customers> results = customersRepository.findAll(request, new Specification<Customers>() {
			
			private static final long serialVersionUID = -3162208814766965517L;

			@Override
			public Predicate toPredicate(Root<Customers> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				return criteriaBuilder.isFalse(root.get("deleted"));
			}
		});
		
		return results;
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public Customers save(@RequestBody CustomersDto dto) {
		Customers entity = null;
		Optional<Customers> optionalEntity = customersRepository.findById(dto.getCustomerNumber());
		
		if(optionalEntity.isPresent()) {
			entity = optionalEntity.get();
		}else {
			entity = new Customers();
			entity.setCustomerNumber(dto.getCustomerNumber());
		}
		
		entity.setCustomerName(dto.getCustomerName());
		entity.setAddressLine1(dto.getAddressLine1());
		entity.setAddressLine2(dto.getAddressLine2());
		entity.setCity(dto.getCity());
		entity.setConstactLastName(dto.getConstactLastName());
		entity.setContactFirstName(dto.getContactFirstName());
		entity.setCountry(dto.getCountry());
		entity.setCreditLimit(dto.getCreditLimit());
		entity.setCustomerNumber(dto.getCustomerNumber());
		entity.setPhone(dto.getPhone());
		entity.setPostalCode(dto.getPostalCode());
		entity.setState(dto.getState());
		
		return customersRepository.save(entity);
	}
}
