package com.Productss;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface productssRepository extends JpaRepository<ProductEntity, Integer>{

	

	
	@Query(value="select * from productt_details where name like ?",nativeQuery = true)
	Optional<ProductEntity> getbyname(String name);
}
