package org.EMSI.Voiture.Repository;


import org.EMSI.Voiture.Model.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoitureRepository extends JpaRepository<Voiture, Long> {
}
