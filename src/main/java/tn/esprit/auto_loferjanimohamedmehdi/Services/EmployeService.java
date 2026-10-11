package tn.esprit.auto_loferjanimohamedmehdi.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.auto_loferjanimohamedmehdi.entities.Employe;
import tn.esprit.auto_loferjanimohamedmehdi.repositories.EmployeRepository;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeService implements IEmployeService {

    private final EmployeRepository repo;

    public Employe add(Employe e) { return repo.save(e); }
    public List<Employe> getAll() { return repo.findAll(); }
    public Employe getById(Long id) { return repo.findById(id).orElse(null); }
    public Employe update(Employe e) { return repo.save(e); }
    public void delete(Long id) { repo.deleteById(id); }
}