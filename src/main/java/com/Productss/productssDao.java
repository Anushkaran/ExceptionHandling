package com.Productss;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class productssDao {

	@Autowired
	productssRepository pr;
	 String setall(List<ProductEntity> p) {
		pr.saveAll(p);
		return "Success";
	}
	public ProductEntity get(int id) {
	
		return pr.findById(id).get();


	}
	public Optional<ProductEntity> getbyname(String name) {
		return pr.getbyname(name);
	}

}
