package tn.esprit.auto_loferjanimohamedmehdi.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.auto_loferjanimohamedmehdi.entities.Client;
import tn.esprit.auto_loferjanimohamedmehdi.repositories.ClientRepository;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService implements IClientService {

    private final ClientRepository repo;

    public Client add(Client c) { return repo.save(c); }
    public List<Client> getAll() { return repo.findAll(); }
    public Client getById(Long id) { return repo.findById(id).orElse(null); }
    public Client update(Client c) { return repo.save(c); }
    public void delete(Long id) { repo.deleteById(id); }
}