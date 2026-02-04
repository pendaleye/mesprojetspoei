import TP3.AuthService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AuthServiceTest {
    private AuthService authService;

    @BeforeClass
    public void setUp() {
        authService = new AuthService();
    }
        @Test
        @Parameters({"username", "password"})

     public void testLoginWithParameters(
     @Optional ("admin") String username,
     @Optional ("1234") String password){

     boolean result = authService.login(username,password);
        Assert.assertEquals(result, true); //pas sur de cette ligne
        //TESTNG2 POUR LE XML
    }
}
