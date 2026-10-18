package tn.esprit.auto_loferjanimohamedmehdi.Services;

import tn.esprit.auto_loferjanimohamedmehdi.entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation r);
    void deleteReservation(Long id);
    List<Reservation> getAllReservations();
    Reservation updateReservation(Reservation reservation);
}