package US22;

import org.testng.annotations.Test;
import pages.QualitydemyGirisSayfasiPage;
import pages.QualitydemyUserCoursePage;
import pages.QualitydemyUserPackage;

public class TC05 {

    QualitydemyGirisSayfasiPage qualitydemyGirisSayfasiPage = new QualitydemyGirisSayfasiPage();
    QualitydemyUserPackage qualitydemyUserPackage = new QualitydemyUserPackage();
    QualitydemyUserCoursePage qualitydemyUserCoursePage = new QualitydemyUserCoursePage();

    @Test(testName = "Test Case 05")
    public void test(){

        // Navigate to qualitydemy home page
        // User successfully login to the webpage
        // Click on instructor link on nav-bar
        // Click on Course manager at Navigation menü
        // Click Basic section on Course manager
        // Test that enable drip content button can be changed
           qualitydemyUserCoursePage.reachCourseManagerPage();
           qualitydemyUserCoursePage.courseEnableDrip(1);
    }
}
