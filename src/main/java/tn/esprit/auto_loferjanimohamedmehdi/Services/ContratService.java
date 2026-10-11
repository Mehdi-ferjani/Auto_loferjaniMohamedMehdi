package tn.esprit.auto_loferjanimohamedmehdi.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.auto_loferjanimohamedmehdi.entities.Contrat;
import tn.esprit.auto_loferjanimohamedmehdi.repositories.ContratRepository;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ContratService implements IContratService {

    private final ContratRepository repo;

    public Contrat add(Contrat c) { return repo.save(c); }
    public List<Contrat> getAll() { return repo.findAll(); }
    public Contrat getById(Long id) { return repo.findById(id).orElse(null); }
    public Contrat update(Contrat c) { return repo.save(c); }
    public void delete(Long id) { repo.deleteById(id); }
}