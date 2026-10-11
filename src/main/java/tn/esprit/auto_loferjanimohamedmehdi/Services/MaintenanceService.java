package tn.esprit.auto_loferjanimohamedmehdi.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.auto_loferjanimohamedmehdi.entities.Maintenance;
import tn.esprit.auto_loferjanimohamedmehdi.repositories.MaintenanceRepository;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MaintenanceService implements IMaintenanceService {

    private final MaintenanceRepository repo;

    public Maintenance add(Maintenance m) { return repo.save(m); }
    public List<Maintenance> getAll() { return repo.findAll(); }
    public Maintenance getById(Long id) { return repo.findById(id).orElse(null); }
    public Maintenance update(Maintenance m) { return repo.save(m); }
    public void delete(Long id) { repo.deleteById(id); }
}