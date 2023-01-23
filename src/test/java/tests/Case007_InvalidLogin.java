package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PracticeAutomation;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class Case007_InvalidLogin {

    @Test (testName = "Case Sensitive username&password Test")
    public void test01(){

        // 1) Open the browser
        // 2) Enter the URL “http://practice.automationtesting.in/”
        Driver.getDriver().get("http://practice.automationtesting.in/");
        // 3) Click on My Account Menu
        PracticeAutomation practiceAutomation = new PracticeAutomation();
        practiceAutomation.myAccountLink.click();
        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitForIt(2);
        practiceAutomation.myAccountLink.click();
        // 4) Enter the case changed username in username textbox
        practiceAutomation.username.sendKeys(ConfigReader.getProperty("usernameCase"));
        // 5) Enter the case changed password in the password textbox
        practiceAutomation.password.sendKeys(ConfigReader.getProperty("passwordCase"));
        // 6) Now click on login button
        practiceAutomation.login.click();
        // 7) Login must fail saying incorrect username/password.
        String expectedError="the password is incorrect.";
        System.out.println(practiceAutomation.invalidLoginError.getText());
        // 8) Close the Driver
        Driver.closeDriver();
    }

    @Test (testName = "Ciceksepet Login")
    public void test02(){

        Driver.getDriver().get("https://www.ciceksepeti.com/");
        Driver.getDriver().findElement(By.xpath("(//*[@class='image-wrapper'])[2]")).click();

        Actions actions = new Actions(Driver.getDriver());
        ReusableMethods.waitForIt(2);
        actions.moveToElement(Driver.getDriver().findElement(By.xpath("(//*[@class='user-menu__link user-process-toggle'])[1]"))).perform();
        ReusableMethods.waitForIt(2);
        Driver.getDriver().findElement(By.xpath("(//*[@class='users-process-list__btn'])[1]")).click();
        WebElement userTextbox= Driver.getDriver().findElement(By.id("EmailLogin"));
        userTextbox.sendKeys(ConfigReader.getProperty("cicekSepetiUser"));
        WebElement passwordTextbox=Driver.getDriver().findElement(By.id("Password"));
        passwordTextbox.sendKeys(ConfigReader.getProperty("cicekSepetiPass"));
        Driver.getDriver().findElement(By.xpath("//button[text()='Giriş']")).click();
        ReusableMethods.waitForIt(10);
    }
}
