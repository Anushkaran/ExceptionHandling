package com.Productss;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class productssService {
	
	@Autowired
	productssDao pd;

	public String setall(List<ProductEntity> p) {
		
		return pd.setall(p);
	}

	public ProductEntity get(int id) {
		
		return pd.get(id);
	}

	public ProductEntity getbyname(String name) throws GivenNameNotFoundException{
		
		return pd.getbyname(name).orElseThrow(()->new GivenNameNotFoundException("Name not found"));
	}

}
