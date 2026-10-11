package tn.esprit.auto_loferjanimohamedmehdi.Services;

import tn.esprit.auto_loferjanimohamedmehdi.entities.Maintenance;
import java.util.List;

public interface IMaintenanceService {
    Maintenance add(Maintenance m);
    List<Maintenance> getAll();
    Maintenance getById(Long id);
    Maintenance update(Maintenance m);
    void delete(Long id);
}