package tn.esprit.auto_loferjanimohamedmehdi.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.auto_loferjanimohamedmehdi.entities.Vehicule;
import tn.esprit.auto_loferjanimohamedmehdi.repositories.VehiculeRepository;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VehiculeService implements IVehiculeService {

    private final VehiculeRepository repo;

    public Vehicule add(Vehicule v) { return repo.save(v); }
    public List<Vehicule> getAll() { return repo.findAll(); }
    public Vehicule getById(Long id) { return repo.findById(id).orElse(null); }
    public Vehicule update(Vehicule v) { return repo.save(v); }
    public void delete(Long id) { repo.deleteById(id); }
}