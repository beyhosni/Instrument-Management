package com.example.InstrumentManager.service;


import com.example.InstrumentManager.model.Category;
import com.example.InstrumentManager.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    // Récupérer toutes les catégories
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    // Ajouter une nouvelle catégorie
    public Category addCategory(String name) {
        Category category = new Category(name);
        return categoryRepository.save(category);
    }
}

