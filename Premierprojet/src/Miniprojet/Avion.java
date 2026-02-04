package Miniprojet;

class Avion extends Vehicule{
    String moteur;
    int heuresVol;

    public Avion(String marque, int dateAchat, double prixAchat, String moteur, int heuresVol){
        super(marque,dateAchat,prixAchat);
        this.moteur=moteur;
        this.heuresVol=heuresVol;
    }
    @Override
    public void calculePrix(int anneeActuelle) {
        prixCourant = prixAchat;
        int temp=0;
        if (moteur.equalsIgnoreCase("HELICES")) {
             temp = heuresVol / 100;
            prixCourant -= prixAchat * 0.10 * temp;
        } else {
            int tranches = heuresVol / 1000;
            prixCourant -= prixAchat * 0.10 * temp;
        }

        if (prixCourant < 0) {
            prixCourant = 0;
        }
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("le moteur : " + moteur);
        System.out.println("heure de vol : " + heuresVol);
    }
}
/// //////

* ===== Classe abstraite Courrier ===== */
abstract class Courrier {
    protected double poids; // grammes
    protected boolean express;
    protected String adresse;
    protected double montant;

    public Courrier(double poids, boolean express, String adresse) {
        this.poids = poids;
        this.express = express;
        this.adresse = adresse;
        this.montant = 0;
    }

    public boolean estValide() {
        return adresse != null && !adresse.trim().isEmpty();
    }

    protected double poidsKg() {
        return poids / 1000.0;
    }

    public void affranchir() {
        if (estValide()) {
            montant = calculerAffranchissement();
            if (express) montant *= 2;
        }
    }

    protected abstract double calculerAffranchissement();

    public double getMontant() {
        return montant;
    }
}

/* ===== Lettre ===== */
class Lettre extends Courrier {
    private String format; // A3 ou A4

    public Lettre(double poids, boolean express, String adresse, String format) {
        super(poids, express, adresse);
        this.format = format;
    }

    protected double calculerAffranchissement() {
        double base = format.equals("A3") ? 3.5 : 2.5;
        return base + poidsKg();
    }

    public String toString() {
        return "Lettre " + format + (estValide() ? "" : " INVALIDE");
    }
}

/* ===== Publicité ===== */
class Publicite extends Courrier {
    public Publicite(double poids, boolean express, String adresse) {
        super(poids, express, adresse);
    }

    protected double calculerAffranchissement() {
        return 5.0 * poidsKg();
    }

    public String toString() {
        return "Publicité" + (estValide() ? "" : " INVALIDE");
    }
}

/* ===== Colis ===== */
class Colis extends Courrier {
    private double volume; // litres

    public Colis(double poids, boolean express, String adresse, double volume) {
        super(poids, express, adresse);
        this.volume = volume;
    }

    public boolean estValide() {
        return super.estValide() && volume <= 50;
    }

    protected double calculerAffranchissement() {
        return 0.25 * volume + poidsKg();
    }

    public String toString() {
        return "Colis volume=" + volume + (estValide() ? "" : " INVALIDE");
    }
}

/* ===== Boîte aux lettres ===== */
class BoiteAuxLettres {
    private List<Courrier> courriers = new ArrayList<>();

    public void ajouter(Courrier c) {
        courriers.add(c);
    }

    public double affranchir() {
        double total = 0;
        for (Courrier c : courriers) {
            c.affranchir();
            total += c.getMontant();
        }
        return total;
    }

    public int courriersInvalides() {
        int n = 0;
        for (Courrier c : courriers)
            if (!c.estValide()) n++;
        return n;
    }

    public void afficher() {
        for (Courrier c : courriers)
            System.out.println(c);
    }
}

/* ===== Tests ===== */
public class Poste {
    public static void testValid() {
        BoiteAuxLettres b = new BoiteAuxLettres();
        b.ajouter(new Lettre(200, false, "Paris", "A4"));
        b.ajouter(new Publicite(1000, true, "Lyon"));
        b.ajouter(new Colis(5000, false, "Marseille", 30));
        b.affranchir();
        System.out.println(b.courriersInvalides() == 0 ? "TestValid() : PASS" : "TestValid() : FAIL");
    }

    public static void testInvalid() {
        BoiteAuxLettres b = new BoiteAuxLettres();
        b.ajouter(new Lettre(200, false, "", "A4"));
        b.ajouter(new Colis(3000, false, "Paris", 80));
        b.affranchir();
        System.out.println(b.courriersInvalides() > 0 ? "TestInvalid() : FAIL" : "TestInvalid() : PASS");
    }

    public static void main(String[] args) {
        testValid();
        testInvalid();
    }
}
