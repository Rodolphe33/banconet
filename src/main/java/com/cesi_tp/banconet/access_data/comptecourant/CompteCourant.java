package com.cesi_tp.banconet.access_data.comptecourant;

import com.cesi_tp.banconet.access_data.client.Client;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CompteCourant {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private String numero;
  private String intitule;
  private double solde;
  private double montantDecouvertAutorise;

  @OneToOne
  private Client client;

  public CompteCourant(
    String numero,
    String intitule,
    double solde,
    double montantDecouvertAutorise
  ) {
    this.numero = numero;
    this.intitule = intitule;
    this.solde = solde;
    this.montantDecouvertAutorise = montantDecouvertAutorise;
    // ++ nbComptesCourants;
  }

  public CompteCourant() {}

  // String toString()

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

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getIntitule() {
    return intitule;
  }

  public void setIntitule(String intitule) {
    this.intitule = intitule;
  }

  public double getSolde() {
    return solde;
  }

  public void setSolde(double solde) {
    this.solde = solde;
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
