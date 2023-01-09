package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PracticeAutomation;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Case005_InvalidLogin {

    @Test(testName = "Empty username & empty password Test")
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
        // 4) Enter empty username in username textbox
        practiceAutomation.username.sendKeys(ConfigReader.getProperty("emptyUsername"));
        // 5) Now enter valid password in the password textbox
        practiceAutomation.password.sendKeys(ConfigReader.getProperty("emptyPassword"));
        // 6) Click on login button.
        practiceAutomation.login.click();
        // 7) Proper error must be displayed(ie required username) and prompt to enter login again
        String expectedError ="Username is required.";
        Assert.assertTrue(practiceAutomation.invalidLoginError.getText().contains(expectedError));
        // 8) Close the Driver
        Driver.closeDriver();

    }
}
//