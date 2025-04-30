package try_catch_finally;

public class try_catch_finally {
    public static void main(String[] args){

        int [] tab = { 1, 2, 3 };
        try {
            int x = tab[5];
            System.out.println(x);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dans le bloc catch");
        }
    }
}
