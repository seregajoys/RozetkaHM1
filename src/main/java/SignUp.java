import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SignUp {
    private WebDriver driver;

    public SignUp(WebDriver driver) {

        this.driver = driver;
    }

    private By userNameField = By.xpath("//*[@id='signup_form']/div[1]/input");
    private By emailFieldOnSignUp = By.xpath("//*[@id=\"signup_form\"]/div[2]/input");
    private By passwordField = By.xpath("//*[@id=\"signup_form\"]/div[3]/input");
    private By signUpButton = By.xpath("//*[@class='btn-link btn-link-green btn-link-sign']");
    private By headtitle = By.xpath("//*[@class='signup-title']");



    public ProfilePage getNewUser() {
       driver.findElement(userNameField).sendKeys("username24");
        driver.findElement(emailFieldOnSignUp).sendKeys("homework9" + System.currentTimeMillis()/100000 + "@gmail.com");
        driver.findElement(passwordField).sendKeys("Qwerty1");
        driver.findElement(signUpButton).click();
        return new ProfilePage(driver);
       }

}

