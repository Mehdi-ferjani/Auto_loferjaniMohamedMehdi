package tn.esprit.auto_loferjanimohamedmehdi.Services;

import tn.esprit.auto_loferjanimohamedmehdi.entities.Agence;

import java.util.List;

public interface IAgenceService {
    Agence addAgence(Agence a);
    void deleteAgence(Long id);
    List<Agence> getAllAgences();
    Agence updateAgence(Agence agence);
}