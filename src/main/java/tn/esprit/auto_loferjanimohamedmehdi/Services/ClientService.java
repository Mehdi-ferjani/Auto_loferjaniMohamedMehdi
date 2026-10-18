package tn.esprit.auto_loferjanimohamedmehdi.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.auto_loferjanimohamedmehdi.entities.Client;
import tn.esprit.auto_loferjanimohamedmehdi.repositories.ClientRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientService implements IClientService {

    private ClientRepository clientRepo;

    @Override
    public Client addClient(Client c) {
        return clientRepo.save(c);
    }

    @Override
    public void deleteClient(Long id) {
        clientRepo.deleteById(id);
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepo.findAll();
    }

    @Override
    public Client updateClient(Client client) {
        return clientRepo.save(client);
    }
}