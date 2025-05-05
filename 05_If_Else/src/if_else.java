package if_else;

public class if_else {
    public static void main(String[] args){

        /*
        * if (expression booléene)
        * {
        *       //Bloc de code
        * }
         */

        int x = 5;
        int y =2;

        if (x > 10){
            System.out.println(x + " est supérieur à " + y);
        }
        y = 20;

        if ((x > y) && (y > 3)){
            System.out.println(x + " est supérieur à " + y + " et y> 3");
        } else if (y > 2){

        }else {

        }

    }
}
