package Exo04encap;

import Creationclasse.Chemise;

public class Voiture {

    // Attribut statique pour l'auto-incrémentation de l'id
    private static int compteur = 0;

    // Attributs
    private int id;
    private String marque;
    private double vitesse;
    private int puissance;

    // Constructeur
    public Voiture(int id, String marque, double vitesse, int puissance) {
        this.id = ++compteur; // auto-incrément
        this.marque = marque;
        this.vitesse = vitesse;
        this.puissance = puissance;
    }

    // Getters et setters
    public int getId() {
        return id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getVitesse() {
        return vitesse;
    }

    public void setVitesse(double vitesse) {
        this.vitesse = vitesse;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "id=" + id +
                ", marque=" + marque +
                ", vitesse=" + vitesse +
                ", puissance=" + puissance;
    }

    // Méthode pour obtenir le nombre de voitures
    public static int getNombreVoitures() {
        return compteur;
    }
}

/*
    public static void main(String[] args) {

        Voiture v1 = new Voiture("BMW", 220.0, 8);
        Voiture v2 = new Voiture("Ford", 200.0, 6);
        Voiture v3 = new Voiture("Audi", 240.0, 8);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        System.out.println("Le nombre des voitures est : " + Voiture.getNombreVoitures());
    }
}
*/



