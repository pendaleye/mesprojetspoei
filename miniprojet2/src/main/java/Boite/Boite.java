package Boite;
import java.util.ArrayList;
import java.util.List;

public class Boite {

    protected List<Courrier> mescourriers;
    protected int tailleTab;

    public Boite(int tailleMax) {
        this.mescourriers = new ArrayList<>();
        this.tailleTab = tailleMax;
    }

    public List<Courrier> getCourrier() {
        return this.mescourriers;
    }

    public int getTaille() {
        return this.tailleTab;
    }

    public void setTaille(int tailleTab) {
        this.tailleTab = tailleTab;
    }



    public void ajouterCourrier(Courrier c) {
        this.mescourriers.add(c);
    }


    public double courriersInvalides() {
        double val = 0;
        for (Courrier c : mescourriers) {
            if (!c.Valide()) {
                val++;
            }
        }
        return val;
    }

    public double affranchir() {
        int finale = 0;
        for (Courrier c : mescourriers) {
            finale += c.affranchir();
        }
        return finale;
    }

    public void afficher() {
        for (Courrier c : mescourriers) {
            if (c.Valide()) {
                System.out.println(c + " (Valide)");
            } else {
                System.out.println(c + " (Invalide)");
            }
        }
    }
}

