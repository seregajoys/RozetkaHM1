import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {

        this.driver = driver;
    }

    private By signInButton = By.xpath("//a[@name='signin']");
    private By signUpForm = By.xpath("//*[@class='auth-f-signup']");
    private By emailField = By.xpath("//*[@id=\"popup_signin\"]/div[1]/div[1]/input");
    private By passfield = By.xpath("//*[@id=\"popup_signin\"]/div[1]/div[2]/div[1]/div[1]/input");
    private By loginbutton = By.xpath("//*[@name='auth_submit']");
    private By searchfield = By.xpath("//*[@id=\"rz-search\"]/form/div[1]/div[2]/input");
    private By searchButton = By.xpath("//span[@class='btn-link btn-link-green']");
    private By cart = By.xpath("//a[@class='hub-i-link hub-i-cart-link sprite-side whitelink']");
    private By profileButton = By.xpath("//a[@name='profile']");
    private By creditPageLink = By.xpath("//*[@class='m-top']/li[2]");
    private By sranuyBanner = By.xpath("//span[@class='exponea-close-cross']");


 public SignUp getSignUpPage () throws InterruptedException {
     driver.findElement(signInButton).click();
     Thread.sleep(2000);
     if(driver.findElement(sranuyBanner).isDisplayed());
     {
         driver.findElement(sranuyBanner).click();
     }
     driver.findElement(signUpForm).click();
       return new SignUp(driver);
   }

   public MainPage logIN(){
     driver.findElement(signInButton).click();
     driver.findElement(emailField).sendKeys("seruy001@mail.ru");
     driver.findElement(passfield).sendKeys("006035");
     driver.findElement(loginbutton).click();
     return this;
   }

   public SearchResult searchProduct(){
     driver.findElement(searchfield).sendKeys("Iphone");
     driver.findElement(searchButton).click();
     return new SearchResult(driver);
   }

   public MainPage clicktocart(){
        driver.findElement(cart).click();
        return this;
   }
   public Boolean profileIsDisplayd(){
     return driver.findElement(profileButton).isDisplayed();
   }

   public CreditPage navigateToCreditPage (){
     driver.findElement(creditPageLink).click();
     return new CreditPage(driver);
   }
}
