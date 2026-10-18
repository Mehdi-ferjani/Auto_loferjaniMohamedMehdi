package tn.esprit.auto_loferjanimohamedmehdi.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.auto_loferjanimohamedmehdi.entities.Contrat;
import tn.esprit.auto_loferjanimohamedmehdi.repositories.ContratRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ContratService implements IContratService {

    private ContratRepository contratRepo;

    @Override
    public Contrat addContrat(Contrat c) {
        return contratRepo.save(c);
    }

    @Override
    public void deleteContrat(Long id) {
        contratRepo.deleteById(id);
    }

    @Override
    public List<Contrat> getAllContrats() {
        return contratRepo.findAll();
    }

    @Override
    public Contrat updateContrat(Contrat contrat) {
        return contratRepo.save(contrat);
    }
}