package tn.esprit.auto_loferjanimohamedmehdi.Services;

import tn.esprit.auto_loferjanimohamedmehdi.entities.Paiement;
import java.util.List;

public interface IPaiementService {
    Paiement add(Paiement p);
    List<Paiement> getAll();
    Paiement getById(Long id);
    Paiement update(Paiement p);
    void delete(Long id);
}