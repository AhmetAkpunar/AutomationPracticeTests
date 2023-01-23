package US19;

import org.testng.annotations.Test;
import pages.QualitydemyGirisSayfasiPage;
import pages.QualitydemyUserCoursePage;
import pages.QualitydemyUserPackage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC03 {

    QualitydemyGirisSayfasiPage qualitydemyGirisSayfasiPage = new QualitydemyGirisSayfasiPage();
    QualitydemyUserPackage qualitydemyUserPackage = new QualitydemyUserPackage();
    QualitydemyUserCoursePage qualitydemyUserCoursePage = new QualitydemyUserCoursePage();

    @Test(testName = "User Story 19 TC_03")
    public void test(){
        // Navigate to qualitydemy home page
        // User successfully login to the webpage
        // Click on instructor link on nav-bar
        // Click on Course manager at Navigation menü
        qualitydemyUserCoursePage.reachCourseManagerPage();
        String firstWHD=Driver.getDriver().getWindowHandle();
        // Clicking on the three dots under the action section on relevant course
        ReusableMethods.waitForIt(2);
        qualitydemyUserCoursePage.threeDotsButton.click();
        // Click on  'View course on fronted' link
        qualitydemyUserCoursePage.courseOnFrontedLink.click();
        // Test that link should redirect to the page of the relevant course
        String newPageWHD=qualitydemyUserCoursePage.getWindowHandle(firstWHD);
        Driver.getDriver().switchTo().window(newPageWHD);
        qualitydemyUserCoursePage.linksRedirectsRelevantCoursePage();
    }
}
