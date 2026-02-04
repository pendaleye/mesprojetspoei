package Tpheritage;

public class Personne {
    //private int id;
    int id;
    String nom;
    String prenom;

    public String toString() {
        return "id=" + id +
                ", nom=" + nom +
                ", prenom=" + prenom ;
    }

    public Personne(int id, String nom, String prenom) {
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
    }
}

class Etudiant extends Personne{
    String one;
    public String toString() {
        return "one=" + one ;}

    //constructeur d'initialisation de la classe fille etudiant
    public Etudiant(int id, String nom, String prenom, String one){
        super(id,nom,prenom);
        this.one=one;
    }

}

class Employe extends Personne{
    double salaire;
    public String toString() {
        return "salaire=" + salaire ;}

    public Employe(int id, String nom, String prenom, double salaire){
        super(id,nom,prenom);
        this.salaire=salaire;
    }

}

class Professeur extends Employe{
    String specialite;
    public String toString() {
        return "specialite=" + specialite ;}

    public Professeur(int id, String nom, String prenom, double salaire, String specialite){
        super(id,nom,prenom,salaire);
        this.specialite=specialite;
    }
}