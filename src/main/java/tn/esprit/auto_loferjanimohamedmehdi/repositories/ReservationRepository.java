package tn.esprit.auto_loferjanimohamedmehdi.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.auto_loferjanimohamedmehdi.entities.Paiement;
import tn.esprit.auto_loferjanimohamedmehdi.entities.Reservation;

@Repository


public interface ReservationRepository extends JpaRepository<Reservation,Long>{
}
