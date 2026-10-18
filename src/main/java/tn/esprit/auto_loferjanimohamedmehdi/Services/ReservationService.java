package tn.esprit.auto_loferjanimohamedmehdi.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.auto_loferjanimohamedmehdi.entities.Reservation;
import tn.esprit.auto_loferjanimohamedmehdi.repositories.ReservationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService {

    private ReservationRepository reservationRepo;

    @Override
    public Reservation addReservation(Reservation r) {
        return reservationRepo.save(r);
    }

    @Override
    public void deleteReservation(Long id) {
        reservationRepo.deleteById(id);
    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepo.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepo.save(reservation);
    }
}