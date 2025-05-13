package fr.cyrilleducq;


public class Main {
    public static void main(String[] args) {

        FormeGeometrique forme = new Rectangle(40, 20);
        System.out.println("La surface du rectangle est : " + forme.calculerSurface());

        forme = new Cercle(10L);
        System.out.println("La surface du cercle est : " + forme.calculerSurface());

    }
}