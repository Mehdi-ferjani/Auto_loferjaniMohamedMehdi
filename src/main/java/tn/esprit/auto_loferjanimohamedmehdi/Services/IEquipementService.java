package tn.esprit.auto_loferjanimohamedmehdi.Services;

import tn.esprit.auto_loferjanimohamedmehdi.entities.Equipement;
import java.util.List;

public interface IEquipementService {
    Equipement add(Equipement e);
    List<Equipement> getAll();
    Equipement getById(Long id);
    Equipement update(Equipement e);
    void delete(Long id);
}