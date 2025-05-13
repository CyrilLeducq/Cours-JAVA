package com.cyrilleducq;

import java.io.Serializable;

public interface A<T> extends Serializable, Comparable<T> {

    public static final int val = 42;

    public abstract void methode1();

    public abstract int methode2();

    // Depuis Java 8 : Méthode statiques dans une interface
    static void methodeStatique(){
        System.out.println("Dans la methode statique");
    }

    // Depuis Java 8 : Méthode par défaut dans une interface
    default void methodeParDefaut(){
        System.out.println("Dans la méthode par défaut");
    }
}
