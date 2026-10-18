package tn.esprit.auto_loferjanimohamedmehdi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.auto_loferjanimohamedmehdi.Services.IContratService;
import tn.esprit.auto_loferjanimohamedmehdi.entities.Contrat;

import java.util.List;

@RestController
@RequestMapping("/contrats")
@AllArgsConstructor
public class ContratController {

    private IContratService contratService;

    @PostMapping("/add")
    public Contrat addContrat(@RequestBody Contrat c) {
        return contratService.addContrat(c);
    }

    @GetMapping("/all")
    public List<Contrat> getAllContrats() {
        return contratService.getAllContrats();
    }

    @PutMapping("/update")
    public Contrat updateContrat(@RequestBody Contrat c) {
        return contratService.updateContrat(c);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteContrat(@PathVariable Long id) {
        contratService.deleteContrat(id);
    }
}