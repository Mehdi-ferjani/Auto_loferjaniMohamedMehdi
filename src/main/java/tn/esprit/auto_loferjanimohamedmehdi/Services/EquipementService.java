package tn.esprit.auto_loferjanimohamedmehdi.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.auto_loferjanimohamedmehdi.entities.Equipement;
import tn.esprit.auto_loferjanimohamedmehdi.repositories.EquipementRepository;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipementService implements IEquipementService {

    private final EquipementRepository repo;

    public Equipement add(Equipement e) { return repo.save(e); }
    public List<Equipement> getAll() { return repo.findAll(); }
    public Equipement getById(Long id) { return repo.findById(id).orElse(null); }
    public Equipement update(Equipement e) { return repo.save(e); }
    public void delete(Long id) { repo.deleteById(id); }
}