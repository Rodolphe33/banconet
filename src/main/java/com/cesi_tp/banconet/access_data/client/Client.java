package com.cesi_tp.banconet.access_data.client;

import javax.persistance.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String nom;
    private String prenom;
    
    CompteCourant compteCourant;
    CompteEpargne compteEpargne;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    public String getNom(){
        return name;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getPrenom() {
        return prenom;
    }
    public void setPrenom(Integer prenom){
        this.prenom = prenom;
    }

    public Client(String nom, String prenom, CompteCourant compteCourant, CompteEpargne compteEpargne){
        this.nom = nom;
        this.prenom = prenom;
        this.compteCourant = compteCourant;
        this.compteEpargne = compteEpargne;
    }

    // String toString()

    // double calculerAvoirGlobal()
}