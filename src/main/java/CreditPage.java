import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CreditPage {
    private WebDriver driver;

    public CreditPage(WebDriver driver){
     this.driver = driver;
    }


    private By creditRules1 = By.xpath("//*[@class='credit-rules-list']/div[1]");
    private By creditRules2 = By.xpath("//*[@class='credit-rules-list']/div[2]");
    private By creditRules3 = By.xpath("//*[@class='credit-rules-list']/div[3]");
    private By creditRules4 = By.xpath("//*[@class='credit-rules-list']/div[4]");
    private By creditTermsAge = By.xpath("(//*[@class='rz-credit-terms-td rz-credit-terms-td-age'])[4]");
    private By creditTermsTitle = By.xpath("//*[@class='rz-credit-block']/h2[contains(text(),\"Условия кредитования\")]");
    private By creditPackTitle = By.xpath("(//*[@class='rz-credit-terms-tr'])[5]/td[1]");
    private By creditPeriod = By.xpath("(//*[@class='rz-credit-terms-tr'])[5]/td[2]");
    private By creditRate = By.xpath("(//*[@class='rz-credit-terms-tr'])[5]/td[3]");
    private By creditComission = By.xpath("(//*[@class='rz-credit-terms-tr'])[5]/td[4]");
    private By creditSingleComission = By.xpath("(//*[@class='rz-credit-terms-tr'])[5]/td[5]");
    private By creditFirstDeposit = By.xpath("(//*[@class='rz-credit-terms-tr'])[5]/td[6]");


    public Boolean getCreditRules1 (){
        return driver.findElement(creditRules1).isDisplayed();
    }

    public Boolean getCreditRules2 (){
        return driver.findElement(creditRules2).isDisplayed();
    }

    public Boolean getCreditRules3 (){
        return driver.findElement(creditRules3).isDisplayed();
    }

    public Boolean getCreditRules4 (){
        return driver.findElement(creditRules4).isDisplayed();
    }

    public CreditPage scrollToElement(){
        WebElement myElement = driver.findElement(creditTermsAge);
        Actions builder = new Actions(driver);
        builder.moveToElement(myElement).build().perform();
        return this;
    }


    public String checkCreditTermsAge(){
       return driver.findElement(creditTermsAge).getText();

    }

    public String  checkTableTitle(){
        return driver.findElement(creditTermsTitle).getText();
    }

    public String checkCreditPackTitle (){
        return driver.findElement(creditPackTitle).getText();
    }

    public String checkCreditPeriod (){
        return driver.findElement(creditPeriod).getText();
    }

    public String checkCreditRate(){
        return driver.findElement(creditRate).getText();
    }

    public String checkCreditComission(){
        return driver.findElement(creditComission).getText();
    }

    public String checkCreditSingleComission(){
        return driver.findElement(creditSingleComission).getText();
    }

    public String checkCreditFirstDeposit(){
        return driver.findElement(creditFirstDeposit).getText();
    }









}
