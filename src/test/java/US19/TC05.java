package US19;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyGirisSayfasiPage;
import pages.QualitydemyUserCoursePage;
import pages.QualitydemyUserPackage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC05 {

    QualitydemyGirisSayfasiPage qualitydemyGirisSayfasiPage = new QualitydemyGirisSayfasiPage();
    QualitydemyUserPackage qualitydemyUserPackage = new QualitydemyUserPackage();
    QualitydemyUserCoursePage qualitydemyUserCoursePage = new QualitydemyUserCoursePage();

    @Test (testName = "Test Case 05")
    public void test(){

        // Navigate to qualitydemy home page
        // User successfully login to the webpage
        // Click on instructor link on nav-bar
        // Click on Course manager at Navigation menü
        qualitydemyUserCoursePage.reachCourseManagerPage();
        String firstPageWHD= Driver.getDriver().getWindowHandle();
        // Click on the three dots under the action section on relevant course
        ReusableMethods.waitForIt(2);
        qualitydemyUserCoursePage.threeDotsButton.click();
        // Click on the 'Edit this course' link
        qualitydemyUserCoursePage.editThisCourseLink.click();
        // Test that the link redirects to the edit page of the relevant course
        String expectedTitle = ConfigReader.getProperty("searchedTitle");
        String actualTitle = qualitydemyUserCoursePage.editThisCoursePage.getText();
        System.out.println(actualTitle);
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

}
