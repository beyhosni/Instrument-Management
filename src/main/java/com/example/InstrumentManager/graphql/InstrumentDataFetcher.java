package com.example.InstrumentManager.graphql;


import com.example.InstrumentManager.model.Instrument;
import com.example.InstrumentManager.service.InstrumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InstrumentDataFetcher {

    @Autowired
    private InstrumentService instrumentService;

    // Requête pour récupérer tous les instruments
    @QueryMapping
    public List<Instrument> getInstruments() {
        return instrumentService.getAllInstruments();
    }

    // Requête pour récupérer un instrument par ID
    @QueryMapping
    public Instrument getInstrumentById(@Argument Long id) {
        return instrumentService.getInstrumentById(id);
    }
}
