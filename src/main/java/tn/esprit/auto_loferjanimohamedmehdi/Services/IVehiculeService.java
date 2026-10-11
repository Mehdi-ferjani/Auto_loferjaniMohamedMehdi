package tn.esprit.auto_loferjanimohamedmehdi.Services;

import tn.esprit.auto_loferjanimohamedmehdi.entities.Vehicule;
import java.util.List;

public interface IVehiculeService {
    Vehicule add(Vehicule v);
    List<Vehicule> getAll();
    Vehicule getById(Long id);
    Vehicule update(Vehicule v);
    void delete(Long id);
}