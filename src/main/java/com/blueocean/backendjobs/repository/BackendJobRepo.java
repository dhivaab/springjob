package com.blueocean.backendjobs.repository;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.blueocean.backendjobs.model.Customer;

public interface BackendJobRepo extends CrudRepository<Customer, Long>{

	@Query("SELECT a FROM Article a WHERE a.title=:title and a.category=:category")
    List<Customer> fetchArticles(@Param("title") String title, @Param("category") String category);
}
