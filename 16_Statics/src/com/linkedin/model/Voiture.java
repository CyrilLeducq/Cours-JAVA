package com.linkedin.model;

public class Voiture {

    //Etat
    private String marque;
    private String couleur;
    private int nombrePlaces;
    public static int compteur;

//    public Voiture() {
//        System.out.println("Construction d'un objet de type Voiture");
//    }

    public Voiture(String marque, String couleur, int nombrePlaces){
        System.out.println("Construction d'un objet de type Voiture");
        this.marque = marque;
        this.couleur = couleur;
        this.nombrePlaces = nombrePlaces;
        compteur++;
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

    public String getMarque(){
        return marque;
    }

    public void setMarque(String marque){
        this.marque = marque;
    }

    public String getCouleur(){
        return couleur;
    }

    public void setCouleur(String couleur){
        this.couleur = couleur;
    }

    public int getNombrePlaces(){
        return nombrePlaces;
    }

    public void setNombrePlaces(int nombrePlaces){
        this.nombrePlaces = nombrePlaces;
    }

    public static int getCompteur(){
        return compteur;
    }


}
