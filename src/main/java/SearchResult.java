import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResult {
    private WebDriver driver;

    public SearchResult(WebDriver driver) {
        this.driver = driver;
    }

    private By firstItem = By.xpath("(//div[@class='g-i-tile-i-title clearfix'])[1]");

    public ProductPage openproduct(){
        driver.findElement(firstItem).click();
        return new ProductPage(driver);
    }
}


