package com.example.proyectpc.controller;

import com.example.proyectpc.entities.Category;
import com.example.proyectpc.entities.Product;
import com.example.proyectpc.service.CategoryServices;
import com.example.proyectpc.service.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryServices categoryServices;

    @GetMapping("/all")
    public List<Category> getAll(){
        return categoryServices.getAll();

    }
    @PostMapping("/save")
    public Category save(@RequestBody Category p){
        return categoryServices.save(p);
    }
}
