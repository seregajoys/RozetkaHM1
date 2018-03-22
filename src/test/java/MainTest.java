
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class MainTest {
    public static WebDriver driver;

    public static final String username = "usernama12";

@BeforeClass
    public  void load(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://rozetka.com.ua");
        }

}
