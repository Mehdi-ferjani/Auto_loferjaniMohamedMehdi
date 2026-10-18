package tn.esprit.auto_loferjanimohamedmehdi.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.auto_loferjanimohamedmehdi.entities.Paiement;
import tn.esprit.auto_loferjanimohamedmehdi.repositories.PaimentRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PaiementService implements IPaiementService {

    private PaimentRepository paiementRepo;

    @Override
    public Paiement addPaiement(Paiement p) {
        return paiementRepo.save(p);
    }

    @Override
    public void deletePaiement(Long id) {
        paiementRepo.deleteById(id);
    }

    @Override
    public List<Paiement> getAllPaiements() {
        return paiementRepo.findAll();
    }

    @Override
    public Paiement updatePaiement(Paiement paiement) {
        return paiementRepo.save(paiement);
    }
}