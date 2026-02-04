import Orgacalculator.Calculatrice;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

//import org.junit.Test;

import org.testng.ITestResult;
import org.testng.annotations.*;

//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.AssertJUnit.assertEquals;


public class CalculatorExtentreport {

    private static ExtentReports extent;
    private static ExtentTest test;

    // ============================================
    // INITIALISATION DU REPORT
    // ============================================
    @BeforeSuite

    public void setupReport() {
        ExtentSparkReporter reporter =
                new ExtentSparkReporter("reports/extent-report.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester","QA engineer");
        extent.setSystemInfo("OS","QA en");
    }

// ===============================
    // AVANT CHAQUE TEST
    // ===============================


    @BeforeMethod
    public void setUpTest(java.lang.reflect.Method method){
        Calculatrice calc= new Calculatrice();
        test = extent.createTest(method.getName());
    }
    @Test
    void additionner_devraitAdditionnerdeuxnombres(){

        Calculatrice calc= new Calculatrice();
        assertEquals(5,calc.additionner(2,3));
        assertEquals(0,calc.additionner(-2,3));

        test.info("voici image").addScreenCaptureFromPath("img.png");

    }

    @Test
    void soustraire_devraitsoustrairedeuxnombres(){

        Calculatrice calc= new Calculatrice();
        assertEquals(1,calc.soustraire(3,2));

    }
    // ============================================
    // APRÈS CHAQUE TEST → LOG DU RÉSULTAT
    // ============================================
    @AfterMethod
    public void logResult(ITestResult result) {

        if (result.getStatus() == ITestResult.SUCCESS) {
            test.pass("Test réussi ✅");
        }
        else if (result.getStatus() == ITestResult.FAILURE) {
            test.fail("Test échoué ❌");
            test.fail(result.getThrowable());
        }
        else if (result.getStatus() == ITestResult.SKIP) {
            test.skip("Test ignoré ⚠️");
        }
    }







    // ============================================
    // FIN DE LA SUITE → GÉNÉRATION DU RAPPORT
    // ============================================
    @AfterSuite
    public void tearDownReport() {
        extent.flush();
    }
}



