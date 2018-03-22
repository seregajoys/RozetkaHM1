import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;



public class SingUpTest extends MainTest{



    @Test
    public static void main() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.getSignUpPage();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getTitle(), "ROZETKA — Регистрация");

    }
    @Test
    public static void sign() throws InterruptedException {
        SignUp signUpPage = new SignUp(driver);
        signUpPage.getNewUser();
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='confirm_email_btn']")).isDisplayed());
        //Assert.assertEquals(driver.getTitle(),"ROZETKA — Личные данные | Личный кабинет");
    }
}
