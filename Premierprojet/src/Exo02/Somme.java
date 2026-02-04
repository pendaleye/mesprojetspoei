package Exo02;
import java.util.Scanner;

public class Somme {
    int n1;
    int n2;

    void sum() {
        int somme1;
        somme1 = n1 + n2;
        //return n1+n2
        System.out.println(somme1);
    }

    Somme(int a , int b){
        this.n1=a;
        this.n2=b;
    }

    public static void main(String[] args) {
        Somme maSomme;
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrer le 1er entier: ");
        int n1 = scan.nextInt();
        System.out.print("Entrer le 2eme entier ");
        int n2 = scan.nextInt();
        maSomme = new Somme(n1,n2);
        maSomme.sum();

    }
}
