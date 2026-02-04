package Encapexo5;

public class Livre {

    private static int cpt=0;
    private int id ;
    private String titre;
    private String auteur ;
    private int pix ;

/*
    public String toString(){ // on l a rajouté pour afficher les valeurs
        return id+" "+
                titre+" "+
                auteur+" "+
                pix;
    }
    */

    // Méthode toString

/*
    public int getId (){
        return id ;
    }
    public void setId(int id){
        this.id=id;
    }

 */
    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String getAuteur() {
        return auteur;
    }
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
        public int getPrix(){
            return pix ;
        }
        public void setPrix(int pix){
            this.pix=pix;
        }

        //comptage de livres
        public static int cptLivres() {
            return cpt;
        }

    public String toString() {
        return "id=" + id +
                ", titre=" + titre +
                ", auteur=" + auteur +
                ", prix=" + pix;
    }

    // constructeur
    public Livre (int id, String titre, String auteur, int pix){

        this.id=id;
        this.titre=titre;
        this.auteur=auteur;
        this.pix=pix;
        cpt++;

    }
    public static void main(String[] args) {

        // NE PAS TENIR COMPTE C EST UN EXEMPLE POUR LE COURS EXCEPTION
       try{
           int resultat=10/0;
       }catch(ArithmeticException e ){
           System.out.println("erreur:"+e.getMessage());

       }finally {
           System.out.println("Fin du traitement:");
       }
        // NE PAS TENIR COMPTE C EST UN EXEMPLE POUR LE COURS EXCEPTION

        Livre l1;
        Livre l2;
        Livre l3;
        l1= new Livre(1,"LangageC","penda",200);
        l2= new Livre(2, "java", "chris",300);
        l3=new Livre(3, "fortran","amy",400);

                System.out.println(l1);
                System.out.println(l2);
                System.out.println(l3);

                System.out.println("Le nombre de livres est : " + Livre.cptLivres());
            }

    }


