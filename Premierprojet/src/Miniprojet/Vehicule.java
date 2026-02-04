package Miniprojet;

import javax.swing.*;

public class Vehicule {
    String marque;
    int dateAchat;
    double prixAchat;
    double prixCourant;

    void affiche(){
        System.out.println("la marque est t: "+ marque);
        System.out.println("date achat: "+ dateAchat);// LIGNE A MODIFIER
        System.out.println("prix achat: "+ prixAchat);

    }

    public void calculePrix(int anneeActuelle) {
        int nbAns = anneeActuelle - dateAchat;
        prixCourant = prixAchat;
        prixCourant -= prixAchat * 0.01 * nbAns; //2% annee
    }

            public Vehicule(String marque, int dateAchat,double prixAchat){
                    this.marque=marque ;
                    this.dateAchat=dateAchat;
                    this.prixAchat=prixAchat;
            }


}


