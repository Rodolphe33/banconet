package com.cesi_tp.banconet.access_data.comptecourant;

import com.cesi_tp.banconet.access_data.client.Client;
import com.cesi_tp.banconet.access_data.compte.Compte;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Override;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CompteCourant extends Compte {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  // private String numero;
  // private String intitule;
  // private double solde;
  private double montantDecouvertAutorise;

  @ManyToOne
  @JsonIgnore
  private Client client;

  public CompteCourant(
    String numero,
    String intitule,
    double solde,
    double montantDecouvertAutorise
  ) {
    super(numero, intitule, solde);
    this.montantDecouvertAutorise = montantDecouvertAutorise;
  }

  public CompteCourant(String intitule, double solde) {
    super(intitule, solde);
  }

  // public CompteCourant() {}

  @Override
  public String toString() {
    return intitule + ", solde: " + solde;
  }

  /**
   * function dediter
   * @param montant doit être négatif
   */
  public void debiter(double montant) {
    this.solde += montant;
  }

  /**
   * function crediter
   * @param montant doit être positif
   */
  public void crediter(double montant) {
    this.solde += montant;
  }

  public double getMontantDecouvertAutorise() {
    return montantDecouvertAutorise;
  }

  public void setMontantDecouvertAutorise(double montantDecouvertAutorise) {
    this.montantDecouvertAutorise = montantDecouvertAutorise;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }
}
