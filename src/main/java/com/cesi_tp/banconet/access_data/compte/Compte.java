package com.cesi_tp.banconet.access_data.compte;

import javax.persistence.Entity;

@Entity
public class Compte {

  protected String numero;
  protected String intitule;
  protected double solde;

  public Compte(String numero, String intitule, double solde) {
    this.numero = numero;
    this.intitule = intitule;
    this.solde = solde;
  }

  public Compte(String intitule, double solde) {
    this.intitule = intitule;
    this.solde = solde;
  }

  public Compte() {}

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
}
