package tn.esprit.auto_loferjanimohamedmehdi.Services;

import tn.esprit.auto_loferjanimohamedmehdi.entities.Client;
import java.util.List;

public interface IClientService {
    Client add(Client c);
    List<Client> getAll();
    Client getById(Long id);
    Client update(Client c);
    void delete(Long id);
}