package tn.esprit.auto_loferjanimohamedmehdi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.auto_loferjanimohamedmehdi.Services.IVehiculeService;
import tn.esprit.auto_loferjanimohamedmehdi.entities.Vehicule;

import java.util.List;

@RestController
@RequestMapping("/vehicules")
@AllArgsConstructor
public class VehiculeController {

    private IVehiculeService vehiculeService;

    @PostMapping("/add")
    public Vehicule addVehicule(@RequestBody Vehicule v) {
        return vehiculeService.addVehicule(v);
    }

    @GetMapping("/all")
    public List<Vehicule> getAllVehicules() {
        return vehiculeService.getAllVehicules();
    }

    @PutMapping("/update")
    public Vehicule updateVehicule(@RequestBody Vehicule v) {
        return vehiculeService.updateVehicule(v);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteVehicule(@PathVariable Long id) {
        vehiculeService.deleteVehicule(id);
    }
}