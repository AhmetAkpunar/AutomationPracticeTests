package US19;

import org.testng.annotations.Test;
import pages.QualitydemyGirisSayfasiPage;
import pages.QualitydemyUserCoursePage;
import pages.QualitydemyUserPackage;
import utilities.ReusableMethods;

public class TC07 {

    QualitydemyGirisSayfasiPage qualitydemyGirisSayfasiPage = new QualitydemyGirisSayfasiPage();
    QualitydemyUserPackage qualitydemyUserPackage = new QualitydemyUserPackage();
    QualitydemyUserCoursePage qualitydemyUserCoursePage = new QualitydemyUserCoursePage();

    @Test(testName = "Test Case 07")
    public void test(){

        // Navigate to qualitydemy home page
        // User successfully login to the webpage
        // Click on instructor link on nav-bar
        // Click on Course manager at Navigation menü
        qualitydemyUserCoursePage.reachCourseManagerPage();
        // Click on the three dots under the action section on relevant course
        ReusableMethods.waitForIt(2);
        qualitydemyUserCoursePage.threeDotsButton.click();
        // Click on the 'Mark as draftedlink'
        qualitydemyUserCoursePage.markAsDraftLink.click();
        // Accept confirmation the message
        qualitydemyUserCoursePage.confirmAcceptLink.click();
        qualitydemyUserCoursePage.pageDown();
        // Test that status of the relevant course changes to Draft
        //ReusableMethods.waitForIt(2);
        qualitydemyUserCoursePage.changeStatusOfCourse("Draft");
    }
}
