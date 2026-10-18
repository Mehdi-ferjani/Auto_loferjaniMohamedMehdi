package tn.esprit.auto_loferjanimohamedmehdi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.auto_loferjanimohamedmehdi.Services.IEmployeService;
import tn.esprit.auto_loferjanimohamedmehdi.entities.Employe;

import java.util.List;

@RestController
@RequestMapping("/employes")
@AllArgsConstructor
public class EmployeController {

    private IEmployeService employeService;

    @PostMapping("/add")
    public Employe addEmploye(@RequestBody Employe e) {
        return employeService.addEmploye(e);
    }

    @GetMapping("/all")
    public List<Employe> getAllEmployes() {
        return employeService.getAllEmployes();
    }

    @PutMapping("/update")
    public Employe updateEmploye(@RequestBody Employe e) {
        return employeService.updateEmploye(e);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmploye(@PathVariable Long id) {
        employeService.deleteEmploye(id);
    }
}