package Rectangle;

import Creationclasse.Chemise;

import java.util.Scanner;

public class Rectangle {
    int a ;
    int b ;

    void surface(){
        int surface1=0;
        surface1= a*b;
        System.out.println(surface1);

    }
    Rectangle(int a,int b){  //CONSTRUCTEUR
        this.a=a;
        this.b=b;

    }

    public static void main(String[] args) {
        Rectangle monRectangle;
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer la largeur: ");
        int nbr1 = sc.nextInt();

        System.out.print("Entrer la longueur: ");
        int nbr2 = sc.nextInt();

        //monRectangle= new Rectangle(2,3);
        monRectangle= new Rectangle(nbr1,nbr2);
        monRectangle.surface();   // POUR APPELER FONCTION


    }
}
