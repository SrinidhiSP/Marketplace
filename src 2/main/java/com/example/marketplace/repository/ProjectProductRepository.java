package com.example.marketplace.repository;

import com.example.marketplace.model.ProjectProduct;
import com.example.marketplace.model.User;
import org.springframework.data.repository.CrudRepository;

public interface ProjectProductRepository extends CrudRepository<ProjectProduct,Integer> {
    
}
