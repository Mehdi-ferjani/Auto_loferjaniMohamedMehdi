package tn.esprit.auto_loferjanimohamedmehdi.Services;

import tn.esprit.auto_loferjanimohamedmehdi.entities.Reservation;
import java.util.List;

public interface IReservationService {
    Reservation add(Reservation r);
    List<Reservation> getAll();
    Reservation getById(Long id);
    Reservation update(Reservation r);
    void delete(Long id);
}