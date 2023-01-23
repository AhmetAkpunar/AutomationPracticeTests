package US22;

import org.testng.annotations.Test;
import pages.QualitydemyGirisSayfasiPage;
import pages.QualitydemyUserCoursePage;
import pages.QualitydemyUserPackage;

public class TC02 {

    QualitydemyGirisSayfasiPage qualitydemyGirisSayfasiPage = new QualitydemyGirisSayfasiPage();
    QualitydemyUserPackage qualitydemyUserPackage = new QualitydemyUserPackage();
    QualitydemyUserCoursePage qualitydemyUserCoursePage = new QualitydemyUserCoursePage();

    @Test(testName = "Test Case 02")
    public void test(){
        // Navigate to qualitydemy home page
        // User successfully login to the webpage
        // Click on instructor link on nav-bar
        // Click on Course manager at Navigation menü
        // Click on the relevant course name on the course list
        // Click Basic section on Course manager
        // Click on course title textbox and Test that it is enabled
        // Click on Short description textbox and Test that it is enabled
        // Click on Description textbox and Test that it is enabled
        qualitydemyUserCoursePage.reachCourseManagerPage();
        qualitydemyUserCoursePage.courseTitleShortDescription(2);
    }
}
