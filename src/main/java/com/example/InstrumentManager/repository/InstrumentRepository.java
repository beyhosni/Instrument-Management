package com.example.InstrumentManager.repository;



import com.example.InstrumentManager.model.Instrument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstrumentRepository extends JpaRepository<Instrument, Long> {
    // Si des méthodes de recherche personnalisées sont nécessaires, elles peuvent être ajoutées ici.
}

