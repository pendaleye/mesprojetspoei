package Boite;
import java.util.ArrayList;

public class Courrier {
    protected double poids;
    protected boolean mode;
    protected String adresse;
   // protected double montant;
//Constructeur
   public Courrier(double poids, boolean mode, String adresse){

    this.poids=poids;
    this.mode=mode;
    this.adresse=adresse;
}

   
    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public boolean setmode() {
        return mode;
    }

    public void setmode(boolean mode) {
        this.mode = mode;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    
    public boolean Valide() {
        return adresse != null && !adresse.isEmpty();
    }

    public double affranchir() {
        if (this.Valide()) {
            if(!mode) {
                return this.affranchirNormal();
            } else {
                return 2 * this.affranchirNormal();
            }
        }
        System.out.println("Le courrier n'est pas valide.");
        return 0;
    }


   public String toString() {
     return "Poids=" + poids + 
            "Mode=" + mode + 
            "Adresse=" + adresse;
  
   }

    public double affranchirNormal() {
        return this.poids * 0.001;
    }

}
