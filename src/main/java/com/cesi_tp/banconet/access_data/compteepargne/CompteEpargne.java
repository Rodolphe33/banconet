package com.cesi_tp.banconet.access_data.compteepargne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CompteEpargne {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private String numero;
  private double solde;
  private double tauxInteret;

  public CompteEpargne(String numero, double solde, double tauxInteret) {
    this.numero = numero;
    this.solde = solde;
    this.tauxInteret = tauxInteret;
  }

  public CompteEpargne() {}

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

  /**
   * function calculinteret
   * @param interet
   */
  public void interet(double interet) {
    this.solde += interet;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public double getSolde() {
    return solde;
  }

  public void setSolde(double solde) {
    this.solde = solde;
  }

  public double getTauxInteret() {
    return tauxInteret;
  }

  public void setTauxInteret(double tauxInteret) {
    this.tauxInteret = tauxInteret;
  }
}
