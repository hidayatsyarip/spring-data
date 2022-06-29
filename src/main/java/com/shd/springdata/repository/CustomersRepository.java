package com.shd.springdata.repository;

import java.util.List;

import org.springframework.data.jpa.datatables.repository.DataTablesRepository;

import com.shd.springdata.entity.Customers;

public interface CustomersRepository extends DataTablesRepository<Customers, Integer> {
	List<Customers> findByCustomerName(String customerName);
}
