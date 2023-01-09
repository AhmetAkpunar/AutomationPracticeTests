package tests;

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
}
