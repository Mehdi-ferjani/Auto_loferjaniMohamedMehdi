package tn.esprit.auto_loferjanimohamedmehdi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.auto_loferjanimohamedmehdi.Services.IAgenceService;
import tn.esprit.auto_loferjanimohamedmehdi.entities.Agence;

import java.util.List;

@RestController
@RequestMapping("/agences")
@AllArgsConstructor
public class AgenceController {

    private IAgenceService agenceService;

    @PostMapping("/add")
    public Agence addAgence(@RequestBody Agence a) {
        return agenceService.addAgence(a);
    }

    @GetMapping("/all")
    public List<Agence> getAllAgences() {
        return agenceService.getAllAgences();
    }

    @PutMapping("/update")
    public Agence updateAgence(@RequestBody Agence a) {
        return agenceService.updateAgence(a);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAgence(@PathVariable Long id) {
        agenceService.deleteAgence(id);
    }
}