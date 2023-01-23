package US22;

import org.testng.annotations.Test;
import pages.QualitydemyGirisSayfasiPage;
import pages.QualitydemyUserCoursePage;
import pages.QualitydemyUserPackage;

public class TC01 {

    QualitydemyGirisSayfasiPage qualitydemyGirisSayfasiPage = new QualitydemyGirisSayfasiPage();
    QualitydemyUserPackage qualitydemyUserPackage = new QualitydemyUserPackage();
    QualitydemyUserCoursePage qualitydemyUserCoursePage = new QualitydemyUserCoursePage();

    @Test(testName = "Test Case 01")
    public void test(){
        // Navigate to qualitydemy home page
        // User successfully login to the webpage
        // Click on instructor link on nav-bar
        // Click on Course manager at Navigation menü
        // Click on the relevant course name on the course list
        // Click Basic section on Course manage
        // Click on 'add new instructor' section
        // Test that adding instructor is possible
           qualitydemyUserCoursePage.reachCourseManagerPage();
           qualitydemyUserCoursePage.addNewInstructor(1);
    }
}
