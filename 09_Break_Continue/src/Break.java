package Break;

public class Break {
    public static void main(String[] args){

        int[] tab = { 55, 26, 14, 67 };
        for (int i =0; i < tab.length; i++){
            if (tab[i] == 26){
                break;//Si je met "continue" a la place de "break" il affichera tout les chiffre s'arretera a 26 et reprendra ensuite donc resultat 55, 14, 67
            }
            System.out.println(tab[i]);
        }
    }
}
