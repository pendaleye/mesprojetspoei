package Exo05;

public class Exo05 {


    public static int fonctioncalcul(int a,
                                     int b,
                                     int c
    ) {
        int somme = a + b + c;
        int moyenne = somme / 3;
        return moyenne;
}
    public static void main(String[] args) {

        int d = 1;
        int e = 3;
        int f = 4;
        int res = fonctioncalcul(d, e, f);

        System.out.println(res);
    }

    }

//correction prof
/*
package base;

import java.util.Scanner;

public class Exo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrer le premier nombre: ");
        int nbr1 = sc.nextInt();

        System.out.print("Entrer le deuxième nombre: ");
        int nbr2 = sc.nextInt();

        System.out.print("Entrer le troisième nombre: ");
        int nbr3 = sc.nextInt();

        System.out.println("La moyenne est: "+(nbr1 + nbr2 + nbr3) / 3);
    }
}
*/
