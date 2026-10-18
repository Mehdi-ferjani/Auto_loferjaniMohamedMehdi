package tn.esprit.auto_loferjanimohamedmehdi.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.auto_loferjanimohamedmehdi.entities.Equipement;
import tn.esprit.auto_loferjanimohamedmehdi.repositories.EquipementRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EquipementService implements IEquipementService {

    private EquipementRepository equipementRepo;

    @Override
    public Equipement addEquipement(Equipement e) {
        return equipementRepo.save(e);
    }

    @Override
    public void deleteEquipement(Long id) {
        equipementRepo.deleteById(id);
    }

    @Override
    public List<Equipement> getAllEquipements() {
        return equipementRepo.findAll();
    }

    @Override
    public Equipement updateEquipement(Equipement equipement) {
        return equipementRepo.save(equipement);
    }
}