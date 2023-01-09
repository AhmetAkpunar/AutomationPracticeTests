package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PracticeAutomation;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Case002_InvalidLogin {

    @Test(testName = "Incorrect username & password Test")
    public void test01(){
        //2) Enter the URL “http://practice.automationtesting.in/”
        Driver.getDriver().get("http://practice.automationtesting.in/");
        //3) Click on My Account Menu
        PracticeAutomation practiceAutomation = new PracticeAutomation();
        practiceAutomation.myAccountLink.click();
        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitForIt(2);
        practiceAutomation.myAccountLink.click();
        //4) Enter incorrect username in username textbox
        practiceAutomation.username.sendKeys(ConfigReader.getProperty("inCUsername"));
        //5) Enter incorrect password in password textbox.
        practiceAutomation.password.sendKeys(ConfigReader.getProperty("inCPassword"));
        //6) Click on login button
        practiceAutomation.login.click();
        //7) Proper error must be displayed(ie Invalid username) and prompt to enter login again
        Assert.assertTrue(practiceAutomation.invalidLoginError.isDisplayed());
        //8) Close the browser
        Driver.closeDriver();
    }


}
