package LeSwitch;

public class Switch {
    public static void main(String[] args){
        /*
        * switch (expression)
        *   {
        *       case constant1: Bloc_de_code1
        *       case constant2: Bloc_de_code2
        *       ...
        *       default: Bloc_de_codeN
        *   }
        */

        int x = 2;

        switch (x){

            case 1:
                System.out.println("option n°1");
                break;
            case 2:
                System.out.println("Option n°2");
                break;
            case 3:
                System.out.println("Option n°3");
                break;
            default:
                System.out.println("Cette option n'existe pas !");
        }

        //Pour ne pas avoir besoin de mettre le break on remplace les : par ->
        int y = 3;

        switch (y){

            case 1->
                System.out.println("option n°1");

            case 2->
                System.out.println("Option n°2");

            case 3->
                System.out.println("Option n°3");

            default->
                System.out.println("Cette option n'existe pas !");
        }

    }
}
