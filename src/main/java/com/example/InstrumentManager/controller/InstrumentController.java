package com.example.InstrumentManager.controller;


import com.example.InstrumentManager.model.Instrument;
import com.example.InstrumentManager.service.InstrumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;

import java.util.List;

@Controller
public class InstrumentController {

    @Autowired
    private InstrumentService instrumentService;

    // Query pour récupérer tous les instruments
    @QueryMapping
    public List<Instrument> getInstruments() {
        return instrumentService.getAllInstruments();
    }

    // Query pour récupérer un instrument par ID
    @QueryMapping
    public Instrument getInstrumentById(@Argument Long id) {
        return instrumentService.getInstrumentById(id);
    }

    // Mutation pour ajouter un nouvel instrument
    @MutationMapping
    public Instrument addInstrument(
            @Argument String name,
            @Argument String serialNumber,
            @Argument Long categoryId) {
        return instrumentService.addInstrument(name, serialNumber, categoryId);
    }

    // Mutation pour mettre à jour un instrument existant
    @MutationMapping
    public Instrument updateInstrument(
            @Argument Long id,
            @Argument String name,
            @Argument String serialNumber) {
        return instrumentService.updateInstrument(id, name, serialNumber);
    }

    // Mutation pour supprimer un instrument
    @MutationMapping
    public Boolean deleteInstrument(@Argument Long id) {
        return instrumentService.deleteInstrument(id);
    }
}

