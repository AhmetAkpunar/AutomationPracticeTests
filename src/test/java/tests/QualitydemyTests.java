package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.security.Key;
import java.time.Duration;

public class QualitydemyTests {

    //qualityDemy web sayfasina gidin
    // cookies i kabul edin
    // login linkine tiklayin
    // email ve password bilgilerini girerek login butonuna tiklayin
    // anasayfadan java kursunu secelim
    // acilan sayfada ders add to wishlist e eklenir
    // urunun eklendigi test edilir
    // eklenilen urun wishlistten cikarilir
    //cikarildigi test ediliri

    @Test
    public void test(){
        Driver.getDriver().get("https://ebay.com");
        ReusableMethods.waitForIt(2);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitForIt(5);
        Driver.getDriver().navigate().refresh();
        actions.scrollByAmount(0,600).perform();
        System.out.println(Driver.getDriver().manage().window().getSize());
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent()).accept();

    }
}
