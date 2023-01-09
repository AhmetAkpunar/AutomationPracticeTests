package tests;

import org.testng.annotations.Test;
import pages.PracticeAutomation;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class Case006_PasswordMasked {

    @Test(testName = "Password Should be Masked")
    public void test01() throws IOException {

        // 1) Open the browser
        // 2) Enter the URL “http://practice.automationtesting.in/”
        Driver.getDriver().get("http://practice.automationtesting.in/");
        // 3) Click on My Account Menu
        PracticeAutomation practiceAutomation = new PracticeAutomation();
        practiceAutomation.myAccountLink.click();
        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitForIt(2);
        practiceAutomation.myAccountLink.click();
        // 4) Enter the password field with some characters.
        practiceAutomation.password.sendKeys("wow!");
        // 5) The password field should display the characters in asterisks or bullets such that
        // the password is not visible on the screen
        ReusableMethods.getScreenshot("Password masked");
        // Screenshot was taken and saved to target/Screenshots/Password masked20230109062154.png

    }
}
