package tn.esprit.auto_loferjanimohamedmehdi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.auto_loferjanimohamedmehdi.Services.IMaintenanceService;
import tn.esprit.auto_loferjanimohamedmehdi.entities.Maintenance;

import java.util.List;

@RestController
@RequestMapping("/maintenances")
@AllArgsConstructor
public class MaintenanceController {

    private IMaintenanceService maintenanceService;

    @PostMapping("/add")
    public Maintenance addMaintenance(@RequestBody Maintenance m) {
        return maintenanceService.addMaintenance(m);
    }

    @GetMapping("/all")
    public List<Maintenance> getAllMaintenances() {
        return maintenanceService.getAllMaintenances();
    }

    @PutMapping("/update")
    public Maintenance updateMaintenance(@RequestBody Maintenance m) {
        return maintenanceService.updateMaintenance(m);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMaintenance(@PathVariable Long id) {
        maintenanceService.deleteMaintenance(id);
    }
}