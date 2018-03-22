import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreditPageTest extends MainTest {
    @Test(priority = 1)
    public void creditRulesIsDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        MainPage mainPage = new MainPage(driver);
        mainPage.navigateToCreditPage();
        CreditPage creditPage = new CreditPage(driver);
        Thread.sleep(5000);
        Assert.assertTrue(creditPage.getCreditRules1());
        Assert.assertTrue(creditPage.getCreditRules2());
        Assert.assertTrue(creditPage.getCreditRules3());
        Assert.assertTrue(creditPage.getCreditRules4());
        Thread.sleep(1000);
        creditPage.scrollToElement();
        Assert.assertEquals(creditPage.checkCreditTermsAge(), "21-70");
    }

        @Test(priority = 2)
        public void checkTable() throws InterruptedException {
        Thread.sleep(5000);
        CreditPage creditPage = new CreditPage(driver);
        creditPage.checkTableTitle();
        Assert.assertEquals(creditPage.checkTableTitle(), "Условия кредитования");
        Thread.sleep(1000);
        Assert.assertEquals(creditPage.checkCreditPackTitle(), "0,01% на 15 месяцев");
        Assert.assertEquals(creditPage.checkCreditPeriod(),"15");
        Assert.assertEquals(creditPage.checkCreditRate(), "0,01");
        Assert.assertEquals(creditPage.checkCreditComission(), "2,5");
        Assert.assertEquals(creditPage.checkCreditSingleComission(), "-");
        Assert.assertEquals(creditPage.checkCreditFirstDeposit(), "от 0");
    }

}
