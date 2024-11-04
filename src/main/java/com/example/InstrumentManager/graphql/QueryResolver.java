package com.example.InstrumentManager.graphql;

import com.example.InstrumentManager.model.Category;
import com.example.InstrumentManager.model.MaintenanceRecord;
import com.example.InstrumentManager.service.CategoryService;
import com.example.InstrumentManager.service.MaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QueryResolver {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private MaintenanceService maintenanceService;

    // Requête pour récupérer toutes les catégories
    @QueryMapping
    public List<Category> getCategories() {
        return categoryService.getAllCategories();
    }

    // Requête pour récupérer les enregistrements de maintenance pour un instrument spécifique
    @QueryMapping
    public List<MaintenanceRecord> getMaintenanceRecordsForInstrument(@Argument Long instrumentId) {
        return maintenanceService.getMaintenanceRecordsForInstrument(instrumentId);
    }
}
