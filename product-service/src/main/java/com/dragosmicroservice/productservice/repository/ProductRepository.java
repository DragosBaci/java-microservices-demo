package com.dragosmicroservice.productservice.repository;

import com.dragosmicroservice.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}

