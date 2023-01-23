package US19;

import org.testng.annotations.Test;
import pages.QualitydemyGirisSayfasiPage;
import pages.QualitydemyUserCoursePage;
import pages.QualitydemyUserPackage;

public class TC09 {

    QualitydemyGirisSayfasiPage qualitydemyGirisSayfasiPage = new QualitydemyGirisSayfasiPage();
    QualitydemyUserPackage qualitydemyUserPackage = new QualitydemyUserPackage();
    QualitydemyUserCoursePage qualitydemyUserCoursePage = new QualitydemyUserCoursePage();

    @Test(testName = "Test Case 09")
    public void test(){

        // Navigate to qualitydemy home page
        // User successfully login to the webpage
        // Click on instructor link on nav-bar
        // Click on Course manager at Navigation menu
        // Click on the three dots under the action section on relevant course
        // Click on 'Delete' link
        // Click on the confirm message
        // Test the relevant course deleted from the list
           qualitydemyUserCoursePage.reachCourseManagerPage();
           qualitydemyUserCoursePage.courseDelete(3,"Guitar");
    }
}
