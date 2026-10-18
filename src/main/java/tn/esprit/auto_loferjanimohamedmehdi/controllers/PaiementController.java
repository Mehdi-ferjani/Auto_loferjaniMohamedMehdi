package tn.esprit.auto_loferjanimohamedmehdi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.auto_loferjanimohamedmehdi.entities.Paiement;

import java.util.List;

@RestController
@RequestMapping("/paiements")
@AllArgsConstructor
public class PaiementController {

    private IPaiementService paiementService;

    @PostMapping("/add")
    public Paiement addPaiement(@RequestBody Paiement p) {
        return paiementService.addPaiement(p);
    }

    @GetMapping("/all")
    public List<Paiement> getAllPaiements() {
        return paiementService.getAllPaiements();
    }

    @PutMapping("/update")
    public Paiement updatePaiement(@RequestBody Paiement p) {
        return paiementService.updatePaiement(p);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePaiement(@PathVariable Long id) {
        paiementService.deletePaiement(id);
    }
}