package tn.esprit.auto_loferjanimohamedmehdi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.auto_loferjanimohamedmehdi.Services.IClientService;
import tn.esprit.auto_loferjanimohamedmehdi.entities.Client;

import java.util.List;

@RestController
@RequestMapping("/clients")
@AllArgsConstructor
public class ClientController {

    private IClientService clientService;

    @PostMapping("/add")
    public Client addClient(@RequestBody Client c) {
        return clientService.addClient(c);
    }

    @GetMapping("/all")
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @PutMapping("/update")
    public Client updateClient(@RequestBody Client c) {
        return clientService.updateClient(c);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
    }
}