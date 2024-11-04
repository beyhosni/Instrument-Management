package com.example.InstrumentManager.graphql;


import com.example.InstrumentManager.model.Instrument;
import com.example.InstrumentManager.model.Category;
import com.example.InstrumentManager.model.MaintenanceRecord;
import com.example.InstrumentManager.service.InstrumentService;
import com.example.InstrumentManager.service.CategoryService;
import com.example.InstrumentManager.service.MaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class MutationResolver {

    @Autowired
    private InstrumentService instrumentService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private MaintenanceService maintenanceService;

    // Mutation pour ajouter un instrument
    @MutationMapping
    public Instrument addInstrument(@Argument String name, @Argument String serialNumber, @Argument Long categoryId) {
        return instrumentService.addInstrument(name, serialNumber, categoryId);
    }

    // Mutation pour mettre à jour un instrument
    @MutationMapping
    public Instrument updateInstrument(@Argument Long id, @Argument String name, @Argument String serialNumber) {
        return instrumentService.updateInstrument(id, name, serialNumber);
    }

    // Mutation pour supprimer un instrument
    @MutationMapping
    public Boolean deleteInstrument(@Argument Long id) {
        return instrumentService.deleteInstrument(id);
    }

    // Mutation pour ajouter une catégorie
    @MutationMapping
    public Category addCategory(@Argument String name) {
        return categoryService.addCategory(name);
    }

    // Mutation pour ajouter un enregistrement de maintenance
    @MutationMapping
    public MaintenanceRecord addMaintenanceRecord(@Argument Long instrumentId, @Argument String maintenanceDate, @Argument String comments) {
        LocalDate date = LocalDate.parse(maintenanceDate);
        return maintenanceService.addMaintenanceRecord(instrumentId, date, comments);
    }
}
