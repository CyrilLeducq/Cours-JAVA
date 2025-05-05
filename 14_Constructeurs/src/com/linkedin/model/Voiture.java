package com.linkedin.model;

public class Voiture {

    //Etat
    String marque;
    String couleur;
    int nombrePlaces;

//    public Voiture() {
//        System.out.println("Construction d'un objet de type Voiture");
//    }

    public Voiture(String marque, String couleur, int nombrePlaces){
        System.out.println("Construction d'un objet de type Voiture");
        this.marque = marque;
        this.couleur = couleur;
        this.nombrePlaces = nombrePlaces;
    }


    //Comportement
    void demarrer(){
        System.out.println("Démarrage de la voiture");
    }

    void arreter(){
        System.out.println("Arrêt de la voiture");
    }

    void accelerer(){
        System.out.println("Accélération de la voiture");
    }

}
