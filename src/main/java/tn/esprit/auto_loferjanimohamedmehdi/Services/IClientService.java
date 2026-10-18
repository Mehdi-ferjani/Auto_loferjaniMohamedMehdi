package tn.esprit.auto_loferjanimohamedmehdi.Services;

import tn.esprit.auto_loferjanimohamedmehdi.entities.Client;

import java.util.List;

public interface IClientService {
    Client addClient(Client c);
    void deleteClient(Long id);
    List<Client> getAllClients();
    Client updateClient(Client client);
}