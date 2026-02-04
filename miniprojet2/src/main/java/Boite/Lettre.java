package Boite;

public class Lettre extends Courrier {
     String format; 

    public Lettre(double poids, boolean mode, String adresse, String format) {
        super(poids, mode, adresse);
        this.format = format;
    }

    public String toString() { 
        return "Lettre : " 
        + super.toString() 
        + "Format=" + format; }
        
    public double affranchirNormal() {
        if (!Valide()){
            return 0;
        }

        double base = 0 ;

        if (format.equals("A4")) {
             base = 2.5; 
            } else { 
            base = 3.5; }
            
            double montant = base + (poids / 1000.0); 
            
        if (mode) {
             montant = montant * 2; 
            } 
            return montant; 
        }

      
    }