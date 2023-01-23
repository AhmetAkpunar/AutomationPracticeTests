package US19;

import org.testng.annotations.Test;
import pages.QualitydemyGirisSayfasiPage;
import pages.QualitydemyUserCoursePage;
import pages.QualitydemyUserPackage;

public class TC11 {

    QualitydemyGirisSayfasiPage qualitydemyGirisSayfasiPage = new QualitydemyGirisSayfasiPage();
    QualitydemyUserPackage qualitydemyUserPackage = new QualitydemyUserPackage();
    QualitydemyUserCoursePage qualitydemyUserCoursePage = new QualitydemyUserCoursePage();

    @Test(testName = "Test Case 11")
    public void test(){

        // Navigate to qualitydemy home page
        // User successfully login to the webpage
        // Click on instructor link on nav-bar
        // Click on Course manager at Navigation menu
        // Click on the course name in the list
        // Test that links redirects to the edit page of the appropirate course
           qualitydemyUserCoursePage.reachCourseManagerPage();
           qualitydemyUserCoursePage.redirectsCourseEditPage(2);
    }
}
