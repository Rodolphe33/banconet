package com.cesi_tp.banconet.access_data.client;

import com.cesi_tp.banconet.access_data.comptecourant.CompteCourant;
import com.cesi_tp.banconet.access_data.compteepargne.CompteEpargne;
import java.lang.Override;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Client {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private String nom;
  private String prenom;

  // @OneToOne
  // @OneToMany
  // @ManyToOne
  // private  compteCourant;
  @OneToMany(mappedBy = "client")
  private List<CompteCourant> compteCourants;

  @OneToOne
  private CompteEpargne compteEpargne;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  @Override
  public String toString() {
    return nom + " " + prenom;
  }

  public Client(
    String nom,
    String prenom,
    CompteCourant compteCourant,
    CompteEpargne compteEpargne
  ) {
    this.nom = nom;
    this.prenom = prenom;
    // this.compteCourant = compteCourant;
    this.compteEpargne = compteEpargne;
  }

  public Client(String nom, String prenom) {
    this.nom = nom;
    this.prenom = prenom;
  }

  public Client() {}

  double calculerAvoirGlobal() {
    return 0; // TODO  à faire
  }

  // public CompteCourant getCompteCourant() {
  //   return compteCourant;
  // }

  // public void setCompteCourant(CompteCourant compteCourant) {
  //   this.compteCourant = compteCourant;
  // }
  public List<CompteCourant> getCompteCourants() {
    return compteCourants;
  }

  public void setCompteCourants(List<CompteCourant> compteCourants) {
    this.compteCourants = compteCourants;
  }

  public CompteEpargne getCompteEpargne() {
    return compteEpargne;
  }

  public void setCompteEpargne(CompteEpargne compteEpargne) {
    this.compteEpargne = compteEpargne;
  }
}
