package com.example.InstrumentManager.service;



import com.example.InstrumentManager.model.*;

import com.example.InstrumentManager.repository.InstrumentRepository;
import com.example.InstrumentManager.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstrumentService {

    @Autowired
    private InstrumentRepository instrumentRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    // Récupérer tous les instruments
    public List<Instrument> getAllInstruments() {
        return instrumentRepository.findAll();
    }

    // Récupérer un instrument par ID
    public Instrument getInstrumentById(Long id) {
        return instrumentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Instrument non trouvé"));
    }

    // Ajouter un nouvel instrument
    public Instrument addInstrument(String name, String serialNumber, Long categoryId) {
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new RuntimeException("Catégorie non trouvée"));
        Instrument instrument = new Instrument(name, serialNumber, category);
        return instrumentRepository.save(instrument);
    }

    // Mettre à jour un instrument existant
    public Instrument updateInstrument(Long id, String name, String serialNumber) {
        Instrument instrument = getInstrumentById(id);
        if (name != null) instrument.setName(name);
        if (serialNumber != null) instrument.setSerialNumber(serialNumber);
        return instrumentRepository.save(instrument);
    }

    // Supprimer un instrument
    public boolean deleteInstrument(Long id) {
        if (instrumentRepository.existsById(id)) {
            instrumentRepository.deleteById(id);
            return true;
        } else {
            throw new RuntimeException("Instrument non trouvé");
        }
    }
}
