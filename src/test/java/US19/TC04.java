package US19;

import org.testng.annotations.Test;
import pages.QualitydemyGirisSayfasiPage;
import pages.QualitydemyUserCoursePage;
import pages.QualitydemyUserPackage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC04 {

    QualitydemyGirisSayfasiPage qualitydemyGirisSayfasiPage = new QualitydemyGirisSayfasiPage();
    QualitydemyUserPackage qualitydemyUserPackage = new QualitydemyUserPackage();
    QualitydemyUserCoursePage qualitydemyUserCoursePage = new QualitydemyUserCoursePage();

    @Test (testName = "Test Case 04")
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

        // Click on 'Go to course playing page'
        qualitydemyUserCoursePage.goToCoursePlayingPage.click();
        // Test that the link redirects the relevant course content page.//
        String secondPageWHD = qualitydemyUserCoursePage.getWindowHandle(firstPageWHD);
        Driver.getDriver().switchTo().window(secondPageWHD);
        qualitydemyUserCoursePage.linksRedirectsRelevantCoursePage();
    }
}
