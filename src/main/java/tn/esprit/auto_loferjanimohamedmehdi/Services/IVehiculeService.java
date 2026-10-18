package tn.esprit.auto_loferjanimohamedmehdi.Services;

import tn.esprit.auto_loferjanimohamedmehdi.entities.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule addVehicule(Vehicule v);
    void deleteVehicule(Long id);
    List<Vehicule> getAllVehicules();
    Vehicule updateVehicule(Vehicule vehicule);
}