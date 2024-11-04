package com.example.InstrumentManager.service;



import com.example.InstrumentManager.model.*;
import com.example.InstrumentManager.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MaintenanceService {

    @Autowired
    private MaintenanceRecordRepository maintenanceRecordRepository;

    @Autowired
    private InstrumentRepository instrumentRepository;

    // Récupérer les enregistrements de maintenance pour un instrument spécifique
    public List<MaintenanceRecord> getMaintenanceRecordsForInstrument(Long instrumentId) {
        Instrument instrument = instrumentRepository.findById(instrumentId)
                .orElseThrow(() -> new RuntimeException("Instrument non trouvé"));
        return instrument.getMaintenanceRecords();
    }

    // Ajouter un nouvel enregistrement de maintenance pour un instrument
    public MaintenanceRecord addMaintenanceRecord(Long instrumentId, LocalDate maintenanceDate, String comments) {
        Instrument instrument = instrumentRepository.findById(instrumentId)
                .orElseThrow(() -> new RuntimeException("Instrument non trouvé"));
        MaintenanceRecord maintenanceRecord = new MaintenanceRecord(maintenanceDate, comments, instrument);
        return maintenanceRecordRepository.save(maintenanceRecord);
    }
}

