package US22;

import org.testng.annotations.Test;
import pages.QualitydemyGirisSayfasiPage;
import pages.QualitydemyUserCoursePage;
import pages.QualitydemyUserPackage;

public class TC06 {

    QualitydemyGirisSayfasiPage qualitydemyGirisSayfasiPage = new QualitydemyGirisSayfasiPage();
    QualitydemyUserPackage qualitydemyUserPackage = new QualitydemyUserPackage();
    QualitydemyUserCoursePage qualitydemyUserCoursePage = new QualitydemyUserCoursePage();

    @Test(testName = "Test Case 05")
    public void test(){
        // Navigate to qualitydemy home page
        // User successfully login to the webpage
        // Click on instructor link on nav-bar
        // Click on Course manager at Navigation menu
        // Click Basic section on Course manager
        // Click on 'Check if this course is top course' checkbox
        // Test that the checkbox is selectable
           qualitydemyUserCoursePage.reachCourseManagerPage();
           qualitydemyUserCoursePage.courseIsTopCourse(3);
    }
}
