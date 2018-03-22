import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogIN extends MainTest {
    @Test
    public static void main () throws InterruptedException {
        MainPage mainPage1 = new MainPage(driver);
        mainPage1.logIN();
        Thread.sleep(2000);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"+mainPage1.profileIsDisplayd());
        Assert.assertTrue(mainPage1.profileIsDisplayd());

    }

}
