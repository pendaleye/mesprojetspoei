package Miniprojet;

public class TestVehicule {
    public static void main(String[] args) {
        int ANNEE_ACTUELLE = 2020;
        Voiture[] garage = new Voiture[2];
        Avion[] hangar = new Avion[2];

        garage[0] = new Voiture("peugeot", 2005, 147325, 2, 5, 180, 12000);
        garage[1] = new Voiture("renault", 2005, 147325, 2, 5, 180, 12000);
        hangar[0] = new Avion("Cessna", 1982, 1230673, "HELICES", 250);
        hangar[1] = new Avion("main connu", 1982, 1230673, "HELICES", 250);

        for (int i = 0; i < garage.length; i++) {
            garage[i].calculePrix(ANNEE_ACTUELLE);
            garage[i].affiche();
        }
        for (int i = 0; i < hangar.length; i++) {
            hangar[i].calculePrix(ANNEE_ACTUELLE);
            hangar[i].affiche();
        }

    }

}