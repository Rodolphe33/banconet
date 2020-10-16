package com.cesi_tp.banconet.access_data.compteepargne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/compteepargne")
public class CompteEpargneController {
    @Autowired 
    private CompteEpargneRepository compteEpargneRepository;

    @PostMapping(path="/addcompteepargne")
    public @ResponseBody String addNewUser (
        @RequestParam String numero,
        @RequestParam String solde,
        @RequestParam double tauxInteret) {

        User n = new User();
        n.setNumero(numero);
        n.setSolde(solde);
        n.setTauxInteret(tauxInteret);
        compteEpargneRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/allcompteepargne")
    public @ResponseBody Iterable<CompteEpargne> getAllCompteEpargnes() {
        // This returns a JSON or XML with the users
        return compteEpargneRepository.findAll();
    }
}