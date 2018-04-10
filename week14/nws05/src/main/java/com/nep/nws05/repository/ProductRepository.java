package com.nep.nws05.repository;

import org.springframework.data.repository.CrudRepository;

import com.nep.nws05.model.Product;

public interface ProductRepository 
	extends CrudRepository<Product, Long> {

}
