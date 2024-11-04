package com.example.InstrumentManager.controller;


import com.example.InstrumentManager.model.Category;
import com.example.InstrumentManager.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    // Query pour récupérer toutes les catégories
    @QueryMapping
    public List<Category> getCategories() {
        return categoryService.getAllCategories();
    }

    // Mutation pour ajouter une nouvelle catégorie
    @MutationMapping
    public Category addCategory(@Argument String name) {
        return categoryService.addCategory(name);
    }
}

