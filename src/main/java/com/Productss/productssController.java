package com.Productss;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productssController {
	@Autowired
	productssService ps;
	
	
	@PostMapping(value="/setall") 
	public String setall(@RequestBody List<ProductEntity> p) {
		return ps.setall(p);
	}
	
	@GetMapping(value="/get/{id}")
	public ProductEntity get(@PathVariable int id) {
		return ps.get(id);
	}
	
	@GetMapping(value="/getbyname/{name}")
	public ProductEntity getbyname(@PathVariable String name) throws GivenNameNotFoundException{
		return ps.getbyname(name);
	}
	

}
