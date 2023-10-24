package br.com.fatec.hellospringboot.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fatec.hellospringboot.entities.Client;

@RestController
public class ClientController {
    
    @GetMapping("client")
    public Client getClient(){
        Client c = new Client();
        c.setId(10);
        c.setName("Eliabe");
        c.setBalance(1000);
        return c;
    }

@GetMapping("clients")
public List<Client> getClients(){
    ArrayList<Client> clients = new ArrayList<Client>();
    
    Client c1 = new Client();
    c1.setId(10);
    c1.setName("Eliabe");
    c1.setBalance(1000);

    Client c2 = new Client();
    c2.setId(11);
    c2.setName("Lais");
    c2.setBalance(1100);

    Client c3 = new Client();
    c3.setId(12);
    c3.setName("Ana");
    c3.setBalance(2000);

    clients.add(c1);
    clients.add(c2);
    clients.add(c3);
    
    return clients;
  
}
}
