package Creationclasse;

public class Chemise {
    int id ;
    char couleur ;
    float prix ;
    String description;
    static int  nbrechemise ;
    int quantite ;

    public String toString(){ // on l a rajouté pour afficher les valeurs
        return id+" "+
                couleur+" "+
                prix+" "+
                description+" "+
                quantite;
    }


    void ajouterChemise(int nombre){
        quantite += nombre ;
    }
    void diminuerChemise(int nombre){
        quantite -= nombre ;
    }
   // void afficherInfoChemise(){
       // System.out.println(id  +couleur  +prix );
   // }

    Chemise(int id, char couleur, float prix){  // LE CONSTRUCTEUR CREE PAS NOUS POUR ABANDONNER LE CONSTRUCTREUR DEFAUT
        this.id=id;
        this.couleur=couleur;
        this.prix=prix;
        nbrechemise++;
    }

    public static void main(String[] args) {
        Chemise maChemise;
        Chemise taChemise;
        maChemise= new Chemise(2,'v',3); // RAPPEL DU CONSTRUCTEUR
        taChemise= new Chemise (3,'r',5);
      //  maChemise.afficherInfoChemise();    //CE QUE T AS CREE . LA FONCTION QUE TU VEUX APPELER
      //  taChemise.afficherInfoChemise();
        System.out.println(maChemise);
        System.out.println( Chemise.nbrechemise);
    }
}
