package com.example.InstrumentManager.repository;

import com.example.InstrumentManager.model.MaintenanceRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaintenanceRecordRepository extends JpaRepository<MaintenanceRecord, Long> {
    // Méthodes de recherche personnalisées si nécessaire.
}

