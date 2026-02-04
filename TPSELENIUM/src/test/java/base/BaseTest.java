package base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

import java.util.HashMap;
import java.util.Map;


public class BaseTest {
   public WebDriver driver;
   public static final Logger logger = LogManager.getLogger(BaseTest.class);

    @BeforeMethod
    public void SetUp(){
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
      //  prefs.put(profile.default_content_settings.popups,0);
        options.addArguments("--incognito"); //pour naviguer en privé
        options.setExperimentalOption("prefs",prefs);
        driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");
    }

 //

}
// aftermethod a faire apres


//public void fillForm(Map<String, String> mapForm){    // generique pour remplir formulaire peu importe login ou
  //  for(elt )
//faire une fonction avec classe inventoryname pour recuperer mes jeux de données
//faire une fonction qui ajoute tous les articles

