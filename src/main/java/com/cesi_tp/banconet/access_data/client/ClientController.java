package com.cesi_tp.banconet.access_data.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/client")
public class ClientController {
    @Autowired

    private ClientRepository clientRepository;

    @PostMapping(path="/addclient")
    public @ResponseBody String addNewClient (
        @RequestParam String nom, 
        @RequestParam String prenom, 
        @RequestParam String compteCourant, 
        @RequestParam String compteEpargne){

        Client n = new Client();
        n.setNom(nom);
        n.setPrenom(prenom);
        n.setCompteCourant(compteCourant);
        n.setCompteEpargne(compteEpargne);
        return "Saved";
        }

        @GetMapping(path="/allclient")
        public @ResponseBody Iterable<Client> getAllClients() {
            return clientRepository.findAll();
        }
}