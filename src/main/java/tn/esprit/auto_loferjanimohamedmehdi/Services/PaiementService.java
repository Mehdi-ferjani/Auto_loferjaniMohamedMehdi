package tn.esprit.auto_loferjanimohamedmehdi.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.auto_loferjanimohamedmehdi.entities.Paiement;
import tn.esprit.auto_loferjanimohamedmehdi.repositories.PaimentRepository;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PaiementService implements IPaiementService {

    private final PaimentRepository repo;

    public Paiement add(Paiement p) { return repo.save(p); }
    public List<Paiement> getAll() { return repo.findAll(); }
    public Paiement getById(Long id) { return repo.findById(id).orElse(null); }
    public Paiement update(Paiement p) { return repo.save(p); }
    public void delete(Long id) { repo.deleteById(id); }
}