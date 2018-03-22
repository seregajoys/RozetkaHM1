
import org.testng.annotations.Test;

public class DDDDD extends MainTest {

    @Test
    public static void main () throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.getSignUpPage();

    }
}
