package tn.esprit.auto_loferjanimohamedmehdi.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.auto_loferjanimohamedmehdi.entities.Employe;
import tn.esprit.auto_loferjanimohamedmehdi.repositories.EmployeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeService implements IEmployeService {

    private EmployeRepository employeRepo;

    @Override
    public Employe addEmploye(Employe e) {
        return employeRepo.save(e);
    }

    @Override
    public void deleteEmploye(Long id) {
        employeRepo.deleteById(id);
    }

    @Override
    public List<Employe> getAllEmployes() {
        return employeRepo.findAll();
    }

    @Override
    public Employe updateEmploye(Employe employe) {
        return employeRepo.save(employe);
    }
}