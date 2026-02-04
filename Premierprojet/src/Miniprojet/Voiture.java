package Miniprojet;

class Voiture extends Vehicule {

    double cylindre;
    int nbPortes;
    double puissance;
    double kilometrage;


    public Voiture(String marque, int dateAchat, double prixAchat,
                   int cylindre, int nbPortes, int puissance, int kilometrage) {
        super(marque, dateAchat, prixAchat);
        this.cylindre = cylindre;
        this.nbPortes = nbPortes;
        this.puissance = puissance;
        this.kilometrage = kilometrage;
    }

        public void calculePrix(int anneeActuelle) {
            int nbAns = anneeActuelle - dateAchat;
            prixCourant = prixAchat;
            prixCourant -= prixAchat * 0.02 * nbAns; //2% annee
        }

        @Override
        public void affiche() {
            super.affiche();
            System.out.println("le Cylindre : " + cylindre );
            System.out.println("le nb de portes : " + nbPortes);
            System.out.println("la puissance : " + puissance );
            System.out.println("le kilométrage : " + kilometrage );
        }

    }




