package Exo07;

public class Exo07 {

   public static int sommetableau(int tableau[]){
       int somme=0;
       for(int i=0 ; i < tableau.length;i++) {
           somme += tableau[i];
       }
           return somme ;

   }
       public static void main(String[] args) {
          int[] tab ={1,2,3,4,5};
          int res= sommetableau(tab);
           System.out.println(res);
       }


}
/* Correction

import java.util.Scanner;

public class exo07 {
    public static void main(String[] args) {
        int n = 5;
        int i;
        int somme = 0;
        int tab[] = new int[n];
        Scanner input = new Scanner(System.in);

        System.out.println("Donnez les valeurs à saisir dans le tableau : ");

        for (i = 0; i < n; i++) {
            System.out.println("Saisissez la valeur num "+(i+1)+" : ");
            tab[i] = input.nextInt();
        }
        for (i = 0; i < n; i++) {
            somme = somme + tab[i];
        }
        System.out.println("La sommes est : " + somme);

    }

}
 */