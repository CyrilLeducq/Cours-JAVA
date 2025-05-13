package com.cyrilleducq;

public class B implements A, C {

    @Override
    public void methode1() {
        System.out.println("Dans methode 1");

    }

    @Override
    public int methode2() {
        System.out.println("Dans methode 2");
        return 0;
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }
}
