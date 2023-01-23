package US19;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyGirisSayfasiPage;
import pages.QualitydemyUserCoursePage;
import pages.QualitydemyUserPackage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC08 {

    QualitydemyGirisSayfasiPage qualitydemyGirisSayfasiPage = new QualitydemyGirisSayfasiPage();
    QualitydemyUserPackage qualitydemyUserPackage = new QualitydemyUserPackage();
    QualitydemyUserCoursePage qualitydemyUserCoursePage = new QualitydemyUserCoursePage();

    @Test(testName = "Test Case 08")
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
        // Click on 'the Publish this course' link
        qualitydemyUserCoursePage.publishCourseLink.click();
        // Click on the confirm message
        qualitydemyUserCoursePage.confirmAcceptLink.click();
        qualitydemyUserCoursePage.pageDown();
        // Test the relevant course status changes to Active
        String expectedStatusText ="Active";
        String actualStatusText = qualitydemyUserCoursePage.statusActiveElement.getText();
        Assert.assertEquals(expectedStatusText,actualStatusText);

    }
}
