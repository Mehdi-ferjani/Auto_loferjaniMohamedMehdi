package tn.esprit.auto_loferjanimohamedmehdi.Services;

import tn.esprit.auto_loferjanimohamedmehdi.entities.Equipement;

import java.util.List;

public interface IEquipementService {
    Equipement addEquipement(Equipement e);
    void deleteEquipement(Long id);
    List<Equipement> getAllEquipements();
    Equipement updateEquipement(Equipement equipement);
}