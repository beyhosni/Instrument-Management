package com.example.InstrumentManager.repository;

import com.example.InstrumentManager.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    // Méthodes de recherche personnalisées si nécessaire.
}
