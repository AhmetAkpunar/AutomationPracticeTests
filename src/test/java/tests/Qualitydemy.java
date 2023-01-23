package tests;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.security.Key;

public class Qualitydemy {

    Actions actions = new Actions(Driver.getDriver());
    public void loginMethodu(){
        Driver.getDriver().get("https://qa.qualitydemy.com/");
        Driver.getDriver().findElement(By.xpath("//*[text()='Log in']")).click();
        WebElement usernameBox = Driver.getDriver().findElement(By.id("login-email"));
        WebElement passwordBox = Driver.getDriver().findElement(By.id("login-password"));
        actions.sendKeys(usernameBox,"pebilog779@vingood.com")
                .sendKeys(Keys.TAB).sendKeys(passwordBox,"Tester23")
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }



    @Test
    public void test01() throws InterruptedException {
        loginMethodu();

        Thread.sleep(3000);
        WebElement categories = Driver.getDriver().findElement(By.xpath("//span[text()" + "='Categories']"));
        WebElement englishCourse= Driver.getDriver().findElement(By.xpath("//span[text()='English Course']"));
        actions.release(categories).release(englishCourse).click().perform();
        actions.scrollByAmount(0,1200).perform();
        WebElement ratingRadio = Driver.getDriver().findElement(By.xpath("//label[@for='rating_5']"));
        ratingRadio.click();

    }

    @Test
    public void fakeMail(){
        Driver.getDriver().get("https://www.fakemail.net/");
        Driver.getDriver().findElement(By.xpath("//div[@class='col-xs-0 col-md-2 hidden-mobile']")).click();
        ReusableMethods.waitForIt(3);
        Driver.getDriver().navigate().to("https://qa.qualitydemy.com/");
        Driver.getDriver().findElement(By.xpath("(//*[text()='Sign Up'])[1]")).click();
        WebElement firstNameBox = Driver.getDriver().findElement(By.xpath("//*[@id='first_name']"));

        WebElement emailBox = Driver.getDriver().findElement(By.id("registration-email"));
       actions.sendKeys(firstNameBox,"John").sendKeys(Keys.TAB)
               .sendKeys("Does").sendKeys(Keys.TAB).sendKeys(Keys.CONTROL).sendKeys("V").sendKeys(Keys.TAB)
               .sendKeys("Tester23").sendKeys(Keys.TAB)
               .sendKeys(Keys.ENTER).perform();
       //Driver.getDriver().findElement(By.xpath("(//button[@type='submit'])[2]")).click();

    }
}
