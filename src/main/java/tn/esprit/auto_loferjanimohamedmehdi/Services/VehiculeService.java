package tn.esprit.auto_loferjanimohamedmehdi.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.auto_loferjanimohamedmehdi.entities.Vehicule;
import tn.esprit.auto_loferjanimohamedmehdi.repositories.VehiculeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class VehiculeService implements IVehiculeService {

    private VehiculeRepository vehiculeRepo;

    @Override
    public Vehicule addVehicule(Vehicule v) {
        return vehiculeRepo.save(v);
    }

    @Override
    public void deleteVehicule(Long id) {
        vehiculeRepo.deleteById(id);
    }

    @Override
    public List<Vehicule> getAllVehicules() {
        return vehiculeRepo.findAll();
    }

    @Override
    public Vehicule updateVehicule(Vehicule vehicule) {
        return vehiculeRepo.save(vehicule);
    }
}