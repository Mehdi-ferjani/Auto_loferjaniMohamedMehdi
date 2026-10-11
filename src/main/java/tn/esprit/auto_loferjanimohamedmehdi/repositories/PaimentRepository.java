package tn.esprit.auto_loferjanimohamedmehdi.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.auto_loferjanimohamedmehdi.entities.Paiement;

@Repository

public interface PaimentRepository extends JpaRepository<Paiement,Long> {
}
