package tn.esprit.auto_loferjanimohamedmehdi.Services;

import tn.esprit.auto_loferjanimohamedmehdi.entities.Employe;
import java.util.List;

public interface IEmployeService {
    Employe add(Employe e);
    List<Employe> getAll();
    Employe getById(Long id);
    Employe update(Employe e);
    void delete(Long id);
}