package tn.esprit.auto_loferjanimohamedmehdi.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.auto_loferjanimohamedmehdi.entities.Maintenance;
import tn.esprit.auto_loferjanimohamedmehdi.repositories.MaintenanceRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class MaintenanceService implements IMaintenanceService {

    private MaintenanceRepository maintenanceRepo;

    @Override
    public Maintenance addMaintenance(Maintenance m) {
        return maintenanceRepo.save(m);
    }

    @Override
    public void deleteMaintenance(Long id) {
        maintenanceRepo.deleteById(id);
    }

    @Override
    public List<Maintenance> getAllMaintenances() {
        return maintenanceRepo.findAll();
    }

    @Override
    public Maintenance updateMaintenance(Maintenance maintenance) {
        return maintenanceRepo.save(maintenance);
    }
}