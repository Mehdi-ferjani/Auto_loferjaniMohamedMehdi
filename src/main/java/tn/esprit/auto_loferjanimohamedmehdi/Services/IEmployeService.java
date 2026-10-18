package tn.esprit.auto_loferjanimohamedmehdi.Services;

import tn.esprit.auto_loferjanimohamedmehdi.entities.Employe;

import java.util.List;

public interface IEmployeService {
    Employe addEmploye(Employe e);
    void deleteEmploye(Long id);
    List<Employe> getAllEmployes();
    Employe updateEmploye(Employe employe);
}