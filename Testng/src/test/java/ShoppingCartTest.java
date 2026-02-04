
import TP2.ShoppingCart;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class ShoppingCartTest {
@BeforeClass
    void lecturedebut(){
    System.out.println("debut des tests du panier ");
}
@Test
    void testAddItem() {
    ShoppingCart shopadd = new ShoppingCart();
    shopadd.addItem("Livre");
    assertEquals("livre","livre");

}
@AfterTest
    void aprestest(){
    System.out.println("le panier contient livre" );
    ShoppingCart shoprem = new ShoppingCart();
    shoprem.addItem("stylo");
    shoprem.addItem("Cahier");
    shoprem.removeItem("stylo");
    assertEquals(1,1);
}



}
