import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SerchProduct extends MainTest {

    @Test
    public static void search() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.searchProduct();
        Thread.sleep(2000);
        SearchResult searchResult = new SearchResult(driver);
        searchResult.openproduct();
        Thread.sleep(2000);
        ProductPage productPage = new ProductPage(driver);
        productPage.addToCart();
        Thread.sleep(2000);
        Assert.assertTrue(productPage.productAddedToCart());

    }


}
