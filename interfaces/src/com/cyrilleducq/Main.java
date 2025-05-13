package com.cyrilleducq;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        A a = new B ();
        a.methode1();
        a.methodeParDefaut();
        A.methodeStatique();

        int valeur =A.val;
    }
}