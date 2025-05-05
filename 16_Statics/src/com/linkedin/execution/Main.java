package com.linkedin.execution;

import com.linkedin.model.Voiture;

public class Main {
    public static void main(String[] args) {


        Voiture v1 = new Voiture("AAA", "Rouge", 5);
        System.out.println(Voiture.compteur);

        Voiture v2 = new Voiture("BBB", "Bleu", 2);
        System.out.println(Voiture.compteur);

        Voiture v3 = new Voiture("CCC", "Jaune", 7);
        System.out.println(Voiture.compteur);

        Voiture v4 = new Voiture("DDD", "Noir", 5);
        System.out.println(Voiture.getCompteur());


    }
}