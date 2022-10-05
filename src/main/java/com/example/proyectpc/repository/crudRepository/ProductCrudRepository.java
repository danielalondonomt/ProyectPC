package com.example.proyectpc.repository.crudRepository;

import com.example.proyectpc.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductCrudRepository extends CrudRepository<Product, Integer> {
}
