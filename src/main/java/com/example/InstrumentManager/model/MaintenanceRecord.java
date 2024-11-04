package com.example.InstrumentManager.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@Entity
public class MaintenanceRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate maintenanceDate;
    private String comments;

    @ManyToOne
    @JoinColumn(name = "instrument_id")
    private Instrument instrument;

    public MaintenanceRecord() {}

    public MaintenanceRecord(LocalDate maintenanceDate, String comments, Instrument instrument) {
        this.maintenanceDate = maintenanceDate;
        this.comments = comments;
        this.instrument = instrument;
    }

}
