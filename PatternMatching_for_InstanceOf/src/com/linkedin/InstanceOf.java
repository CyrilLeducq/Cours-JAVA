package com.linkedin;

public class InstanceOf {

    public static void main(String[] args) {
        Animal a = new Chat();
        communiquerV1(a);
        communiquerV2(a);
    }

    public static void communiquerV1 (Animal animal){

        if (animal instanceof Chat){
            Chat chat= (Chat) animal;
            chat.miauler();
        }else if (animal instanceof Chien){
            Chien chien = (Chien) animal;
            chien.aboyer();
        }
    }

    public static void communiquerV2 (Animal animal){

        if (animal instanceof Chat chat){
            chat.miauler();
        }else if (animal instanceof Chien chien){
            chien.aboyer();
        }
    }
}
