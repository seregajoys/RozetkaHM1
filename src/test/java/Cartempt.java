import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Cartempt extends MainTest {
    @Test
    public static void checkcart() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.clicktocart();
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"drop-block\"]")).isDisplayed());
    }
}
