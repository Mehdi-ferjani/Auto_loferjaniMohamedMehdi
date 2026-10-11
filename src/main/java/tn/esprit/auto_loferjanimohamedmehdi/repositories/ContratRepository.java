package tn.esprit.auto_loferjanimohamedmehdi.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.auto_loferjanimohamedmehdi.entities.Contrat;

@Repository
public interface ContratRepository extends JpaRepository<Contrat,Long> {
}
