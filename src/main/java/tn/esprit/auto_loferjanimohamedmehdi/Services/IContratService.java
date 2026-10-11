package tn.esprit.auto_loferjanimohamedmehdi.Services;

import tn.esprit.auto_loferjanimohamedmehdi.entities.Contrat;
import java.util.List;

public interface IContratService {
    Contrat add(Contrat c);
    List<Contrat> getAll();
    Contrat getById(Long id);
    Contrat update(Contrat c);
    void delete(Long id);
}