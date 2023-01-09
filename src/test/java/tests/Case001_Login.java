package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PracticeAutomation;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;

public class Case001_Login {

    @Test
    public void loginTest(){
        // 2) Enter the URL “http://practice.automationtesting.in/”
        Driver.getDriver().get(ConfigReader.getProperty("practiceAutoUrl"));
        // 3) Click on My Account Menu
        PracticeAutomation practiceAutomation = new PracticeAutomation();
        practiceAutomation.myAccountLink.click();
        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitForIt(2);
        practiceAutomation.myAccountLink.click();
        // 4) Enter registered username in username textbox
        practiceAutomation.username.sendKeys(ConfigReader.getProperty("username"));
        // 5) Enter password in password textbox
        practiceAutomation.password.sendKeys(ConfigReader.getProperty("password"));
        // 6) Click on login button
        practiceAutomation.login.click();
        // 7) User must successfully login to the web page
        Assert.assertTrue(practiceAutomation.myAccountNavBar.isDisplayed());
        // 8) Click on Myaccount link which leads to Dashboard
        practiceAutomation.myAccountLink.click();
        // 9) User must view Dashboard of the site
        Assert.assertTrue(practiceAutomation.dashboard.isDisplayed());
        // 10) Close the browser
        Driver.closeDriver();
    }
}
