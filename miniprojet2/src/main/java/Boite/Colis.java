package Boite;

public class Colis extends Courrier {
    double volume; //

    public Colis(double poids, boolean mode, String adresse, double volume) {
        super(poids, mode, adresse);
        this.volume = volume;
    }
    public String toString() {
         return "Colis " + 
         super.toString() + 
         "Volume=" + volume ; }

    public boolean Valide() {
        
        return super.Valide() && volume <= 50;
    }

     public double affranchirNormal() {   // fonction pour calcul affranchir

        if (!Valide()) {
             return 0; 
            } 
            
            double montant = 0.25 * volume; montant = montant + (poids / 1000.0); 
            if (mode) { 
                montant = montant * 2; 
            }
             return montant; }

    }






