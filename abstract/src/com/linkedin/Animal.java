package com.linkedin;

public abstract class Animal {

    private String prenom;
    private int taille;
    private int poids;
    private int age;

    public Animal(String prenom, int taille, int poids, int age){
        this.prenom = prenom;
        this.taille = taille;
        this.poids = poids;
        this.age = age;
    }

    public abstract void manger();

    public void seDeplacer(){
        System.out.println("L'animal se déplace");
    }



}
