package tn.esprit.auto_loferjanimohamedmehdi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.auto_loferjanimohamedmehdi.Services.IEquipementService;
import tn.esprit.auto_loferjanimohamedmehdi.entities.Equipement;

import java.util.List;

@RestController
@RequestMapping("/equipements")
@AllArgsConstructor
public class EquipementController {

    private IEquipementService equipementService;

    @PostMapping("/add")
    public Equipement addEquipement(@RequestBody Equipement e) {
        return equipementService.addEquipement(e);
    }

    @GetMapping("/all")
    public List<Equipement> getAllEquipements() {
        return equipementService.getAllEquipements();
    }

    @PutMapping("/update")
    public Equipement updateEquipement(@RequestBody Equipement e) {
        return equipementService.updateEquipement(e);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEquipement(@PathVariable Long id) {
        equipementService.deleteEquipement(id);
    }
}