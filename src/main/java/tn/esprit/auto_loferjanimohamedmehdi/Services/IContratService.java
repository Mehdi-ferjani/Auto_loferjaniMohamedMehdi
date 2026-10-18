package tn.esprit.auto_loferjanimohamedmehdi.Services;

import tn.esprit.auto_loferjanimohamedmehdi.entities.Contrat;

import java.util.List;

public interface IContratService {
    Contrat addContrat(Contrat c);
    void deleteContrat(Long id);
    List<Contrat> getAllContrats();
    Contrat updateContrat(Contrat contrat);
}