import Orgacalculator.Calculatrice;

public class TestCalculatrice {
    public static void main(String[] args) {
        Calculatrice calc = new Calculatrice();
        int resultats= calc.additionner(2,3);
        if(resultats==5) {
            System.out.println("Test addition reussi");
        }else{
            System.out.println("Test addition écoué");
        }
    }
}
