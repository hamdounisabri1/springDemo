package tn.esprit.springprod.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springprod.entities.Chambre;
import tn.esprit.springprod.entities.Reservation;
import tn.esprit.springprod.entities.TypeChambre;

import java.util.Date;
import java.util.List;

@Repository

public interface IReservationRepository extends CrudRepository<Reservation, String> {

    @Query("SELECT r FROM Reservation r WHERE r.anneeUniversitaire = :anneeUniversitaire AND r.chambre.bloc.foyer.universite.nomUniversite = :nomUniversite")
    List<Reservation> findReservationsByAnneeUniversitaireAndNomUniversite(Date anneeUniversitaire, String nomUniversite);


}
