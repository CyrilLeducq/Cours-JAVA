package com.linkedin;

public class Animal {

    private String nom;
    private int taille;
    private int poids;
    private int age;

    public Animal(String nom, int taille, int poids, int age){
        this.nom = nom;
        this.taille = taille;
        this.poids = poids;
        this.age = age;
    }

    public void seDeplacer(){
        System.out.println("L'animal se déplace");
    }

    public void manger(){
        System.out.println("L'animal mange");
    }

    public String getNom(){
        return nom;
    }

    public void setNom(){
        this.nom = nom;
    }
}
