package com.example.proyectpc.controller;

import com.example.proyectpc.entities.Product;
import com.example.proyectpc.service.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductServices productServices;

    @GetMapping("/all")
    public List<Product> getAll(){
        return productServices.getAll();

    }
    @PostMapping("/save")
    public Product save(@RequestBody Product p){
        return productServices.save(p);
    }
}
