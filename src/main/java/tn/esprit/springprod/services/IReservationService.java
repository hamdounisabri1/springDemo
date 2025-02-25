package tn.esprit.springprod.services;

import tn.esprit.springprod.entities.Reservation;

import java.util.List;

public interface IReservationService {

    List<Reservation> retrieveAllReservation();
    Reservation updateReservation (Reservation res);
    Reservation retrieveReservation (String idReservation);

}
