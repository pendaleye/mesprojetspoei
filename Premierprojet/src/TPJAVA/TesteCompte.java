package TPJAVA;
/*
import Encapexo5.Livre;

public class TesteCompte {
    int solde =0;
    String nom;
    void deposer(int montant){
        solde = solde+ montant;
    }
    void retirer(int montant){
        solde = solde-montant;
    }
    void virervers(int montant, TesteCompte destination){
        this.retirer(montant);
        destination.deposer(montant);
    }
void afficher(){
        System.out.println("nom: "+ nom);// LIGNE A MODIFIER
        System.out.println("solde: "+ solde);
}

public TesteCompte(int solde, String nom){
        this.solde=solde;
        this.nom=nom;
}

//public static void main(String[] args) {

        TesteCompte comptePenda;
        TesteCompte compteAmy;

        // creer tableau de 10cmpt
        TesteCompte[] tabcomptes ;
        tabcomptes=new TesteCompte[10];
/*
        for(int i=0; i < tabcomptes.length;i++){
            tabcomptes[i]= new TesteCompte();
            tabcomptes[i].deposer(200);
        }
//virement
        for(int i=0; i < tabcomptes.length-1;i++){
        //    tabcomptes[i]= new TesteCompte();
             tabcomptes[i].virervers(20,tabcomptes[i+1]);
            tabcomptes[i].afficher();
        }

        for(int i=0; i < tabcomptes.length;i++){
            System.out.println("Le compte est : " + (i+1));
            tabcomptes[i].afficher();
        }

        comptePenda= new TesteCompte();
        compteAmy= new TesteCompte();
//dépot de 500 euros sur le premier compte dépot de 1000 euros sur le second compte.
//retrait de 10 euros sur le second compte.
// virement de 75 euros du premier compte vers le second.
        comptePenda.deposer(500);
        comptePenda.deposer(1000);
        compteAmy.retirer(10);
        comptePenda.virervers(75,compteAmy);

        //– affichage des soldes des deux comptes.
        comptePenda.afficher();
        compteAmy.afficher();

    }
*/
