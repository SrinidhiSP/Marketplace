package com.example.marketplace.repository;

import com.example.marketplace.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Integer> {
//    String findAllByProduct_id(int Product_id);
//    List<Project> findByProduct_id(int Product_id);

}
