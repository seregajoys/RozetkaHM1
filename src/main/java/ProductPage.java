import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;

    public ProductPage(WebDriver driver){
        this.driver = driver;
    }

    private By buyButton = By.xpath("//*[@name='topurchases']");
    private By popupAddToCart = By.xpath("//*[@id=\"cart-popup\"]/div[2]/div[1]/h2");

    public ProductPage addToCart(){
        driver.findElement(buyButton).click();
        return this;
    }
    public Boolean productAddedToCart(){
        return driver.findElement(popupAddToCart).isDisplayed();
    }
}
