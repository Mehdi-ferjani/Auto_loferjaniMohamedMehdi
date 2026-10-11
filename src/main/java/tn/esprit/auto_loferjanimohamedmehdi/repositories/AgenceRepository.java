package tn.esprit.auto_loferjanimohamedmehdi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.auto_loferjanimohamedmehdi.entities.Agence;
import org.springframework.stereotype.Repository;
@Repository

public interface AgenceRepository  extends JpaRepository<Agence,Long> {

    void deleteAllById(Long id);
}
