package tn.esprit.auto_loferjanimohamedmehdi.repositories;

import com.fasterxml.jackson.annotation.JacksonAnnotation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.auto_loferjanimohamedmehdi.entities.Maintenance;

@Repository

public interface MaintenanceRepository extends JpaRepository<Maintenance,Long> {
}
