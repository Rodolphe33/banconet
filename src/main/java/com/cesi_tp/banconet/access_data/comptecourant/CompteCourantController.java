package com.cesi_tp.banconet.access_data.comptecourant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/comptecourant")
public class CompteCourantController {

  @Autowired
  private CompteCourantRepository compteCourantRepository;

  @PostMapping(path = "/addcomptecourant")
  public @ResponseBody String addNewCompteCourant(
    @RequestParam String numero,
    @RequestParam String intitule,
    @RequestParam double solde,
    @RequestParam double montantDecouvertAutorise
  ) {
    CompteCourant n = new CompteCourant(
      numero,
      intitule,
      solde,
      montantDecouvertAutorise
    );
    compteCourantRepository.save(n);
    return "Saved";
  }

  @GetMapping(path = "/allcomptecourant")
  public @ResponseBody Iterable<CompteCourant> getAllCompteCourants() {
    return compteCourantRepository.findAll();
  }
}
