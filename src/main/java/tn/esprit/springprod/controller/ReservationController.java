package tn.esprit.springprod.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springprod.entities.Reservation;
import tn.esprit.springprod.services.ReservationService;

import java.util.List;

@RestController
@RequestMapping("reservation")
public class ReservationController {

    @Autowired
     ReservationService reservationService;

    @GetMapping("/getAll")
    public List<Reservation> getAllReservations() {
        return reservationService.retrieveAllReservation();
    }

    @GetMapping("/{id}")
    public Reservation getReservationById(@PathVariable("id") String idReservation) {
        return reservationService.retrieveReservation(idReservation);
    }

    @PutMapping("/update")
    public Reservation updateReservation(@RequestBody Reservation reservation) {
        return reservationService.updateReservation(reservation);
    }
}
