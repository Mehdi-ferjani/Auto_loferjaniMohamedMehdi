package tn.esprit.auto_loferjanimohamedmehdi.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.auto_loferjanimohamedmehdi.entities.Agence;
import tn.esprit.auto_loferjanimohamedmehdi.repositories.AgenceRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class AgenceService implements IAgenceService {

    private AgenceRepository agenceRepo;

    @Override
    public Agence addAgence(Agence a) {
        return agenceRepo.save(a);
    }

    @Override
    public void deleteAgence(Long id) {
        agenceRepo.deleteById(id);
    }

    @Override
    public List<Agence> getAllAgences() {
        return agenceRepo.findAll();
    }

    @Override
    public Agence updateAgence(Agence agence) {
        return agenceRepo.save(agence);
    }
}