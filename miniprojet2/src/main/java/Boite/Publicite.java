package Boite;

public class Publicite extends Courrier {

    public Publicite(double poids, boolean mode, String adresse) {

        super(poids, mode, adresse);
    }
    public String toString() { 
        return "Publicite : " + super.toString();
    }
    public double affranchirNormal() {
        if (!Valide()) {
             return 0; 
            } 
            
            double montant = 5.0 * (poids / 1000.0);
             if (mode) {
                 montant = montant * 2; 
                } 
                return montant;
             } 
    }

