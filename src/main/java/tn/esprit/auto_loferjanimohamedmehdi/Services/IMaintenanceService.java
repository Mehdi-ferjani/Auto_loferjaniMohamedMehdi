package tn.esprit.auto_loferjanimohamedmehdi.Services;

import tn.esprit.auto_loferjanimohamedmehdi.entities.Maintenance;

import java.util.List;

public interface IMaintenanceService {
    Maintenance addMaintenance(Maintenance m);
    void deleteMaintenance(Long id);
    List<Maintenance> getAllMaintenances();
    Maintenance updateMaintenance(Maintenance maintenance);
}