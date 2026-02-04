import TP1.Calculator;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class CalculatorTest {

@BeforeClass  // APRES CHAQUE ANNOTATION ON A UNE FONCTION
public void lecture() {
    System.out.println("Début des Tests");
}
@BeforeMethod
public void lecture3() { System.out.println("Test addition"); }
//@Test(priority = 2)
@Test
void verifadd(){
Calculator calc = new Calculator();
assertEquals(5,calc.add(2,3));
}

  //  @Test(priority = 1)
  @Test
  void verifasous(){
        Calculator calc = new Calculator();
        assertEquals(3, calc.substract(5,2));
    }
@AfterMethod
public void lecture2() {
    System.out.println("Test soustraction validé");
}
    @Test
    void testpositif(){
        Calculator calc = new Calculator();
        assertTrue(calc.isPositive(5));
        assertFalse(calc.isPositive(-2));

    }

}
