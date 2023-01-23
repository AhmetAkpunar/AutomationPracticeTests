package US19;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyGirisSayfasiPage;
import pages.QualitydemyUserCoursePage;
import pages.QualitydemyUserPackage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC06 {

    QualitydemyGirisSayfasiPage qualitydemyGirisSayfasiPage = new QualitydemyGirisSayfasiPage();
    QualitydemyUserPackage qualitydemyUserPackage = new QualitydemyUserPackage();
   QualitydemyUserCoursePage qualitydemyUserCoursePage = new QualitydemyUserCoursePage();

    @Test(testName = "Test Case 06")
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
        // Click on 'Section and lesson' link
        qualitydemyUserCoursePage.sectionAndLessonLink.click();
        // Test that Add Section button appears
        ReusableMethods.waitForIt(2);
        Assert.assertTrue(qualitydemyUserCoursePage.addSectionButton.isDisplayed());
        //Driver.quitDriver();
    }
}
