package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PracticeAutomation;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Case003_InvalidLogin {

    @Test (testName = "Valid username & Empty password Test")
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
        // 4) Enter valid username in username textbox
        practiceAutomation.username.sendKeys(ConfigReader.getProperty("username"));
        // 5) Now enter empty password in the password textbox
        practiceAutomation.password.sendKeys(ConfigReader.getProperty("emptyPassword"));
        // 6) Click on login button.
        practiceAutomation.login.click();
        // 7) Proper error must be displayed(ie Invalid password) and prompt to enter login again
        String expectedError="Password is required.";
        Assert.assertTrue(practiceAutomation.invalidLoginError.getText().contains(expectedError));
        // 8) Close the Driver
        Driver.closeDriver();
    }

}
