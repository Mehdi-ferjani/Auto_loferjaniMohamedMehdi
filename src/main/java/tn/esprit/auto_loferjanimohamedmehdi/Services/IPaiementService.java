package tn.esprit.auto_loferjanimohamedmehdi.Services;

import tn.esprit.auto_loferjanimohamedmehdi.entities.Paiement;

import java.util.List;

public interface IPaiementService {
    Paiement addPaiement(Paiement p);
    void deletePaiement(Long id);
    List<Paiement> getAllPaiements();
    Paiement updatePaiement(Paiement paiement);
}