package tn.esprit.auto_loferjanimohamedmehdi.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.auto_loferjanimohamedmehdi.entities.Employe;

@Repository

public interface EmployeRepository extends JpaRepository<Employe,Long> {
}
