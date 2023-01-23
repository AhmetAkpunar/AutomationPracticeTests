package tests;

import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DemoqaPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class DemoqaCase {

    static DemoqaPage demoqaPage;


    @Test
    public void test01() throws InterruptedException {

        demoqaPage = new DemoqaPage();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        //1) https://demoqa.com/browser-windows adresine gidin
        Driver.getDriver().get("https://demoqa.com/browser-windows");
        Actions actions = new Actions(Driver.getDriver());


        //2) Alerts’e tiklayin
        //ReusableMethods.waitForIt(2);
        wait.until(ExpectedConditions.visibilityOf(demoqaPage.alertButonu)).click();

        //3) On button click, alert will appear after 5 seconds karsisindaki click me butonuna basin
        wait.until(ExpectedConditions.visibilityOf(demoqaPage.clickMeButonu)).click();
        //4) Allert’in gorunur olmasini bekleyin
        wait.until(ExpectedConditions.alertIsPresent());
        String actualAlertText= Driver.getDriver().switchTo().alert().getText();
        String expectedYazi="This alert appeared after 5 seconds";
        Assert.assertEquals(expectedYazi,actualAlertText);
        System.out.println(actualAlertText);
        //Thread.sleep(2);
        //5) Allert uzerindeki yazinin “This alert appeared after 5 seconds” oldugunu test edin
        /*
        ReusableMethods.waitForIt(2);

         */

        //6) Ok diyerek alerti kapatin
        //Driver.getDriver().switchTo().alert().accept();

        //7) Browser'ı kapat

        Driver.quitDriver();

    }

}
