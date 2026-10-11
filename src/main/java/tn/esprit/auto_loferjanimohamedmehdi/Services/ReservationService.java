package tn.esprit.auto_loferjanimohamedmehdi.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.auto_loferjanimohamedmehdi.entities.Reservation;
import tn.esprit.auto_loferjanimohamedmehdi.repositories.ReservationRepository;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationService implements IReservationService {

    private final ReservationRepository repo;

    public Reservation add(Reservation r) { return repo.save(r); }
    public List<Reservation> getAll() { return repo.findAll(); }
    public Reservation getById(Long id) { return repo.findById(id).orElse(null); }
    public Reservation update(Reservation r) { return repo.save(r); }
    public void delete(Long id) { repo.deleteById(id); }
}