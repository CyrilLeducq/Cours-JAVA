package propager_exception;

import java.io.IOException;

public class propager_exception {
    public static void main(String[] args){
        method2();
    }

    static void method1()   throws IOException {
        System.out.println("Cette methode peut lever une exception");
        //if(condition)
        throw new IOException();
    }

    static void method2() {
        try {
            method1();
        } catch (IOException e){
            System.out.println("l'exception à été attrapée");
        }
    }

}
