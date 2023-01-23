package US19;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyGirisSayfasiPage;
import pages.QualitydemyUserCoursePage;
import pages.QualitydemyUserPackage;
import utilities.ConfigReader;

public class TC02 {

    QualitydemyGirisSayfasiPage qualitydemyGirisSayfasiPage = new QualitydemyGirisSayfasiPage();
    QualitydemyUserPackage qualitydemyUserPackage = new QualitydemyUserPackage();
    QualitydemyUserCoursePage qualitydemyUserCoursePage = new QualitydemyUserCoursePage();

    @Test(testName = "User Story 19 TC_02")
    public void test(){

        // Navigate to qualitydemy home page
        // User successfully login to the webpage
        // Click on instructor link on nav-bar
        // Click on Course manager at Navigation menü
        qualitydemyUserCoursePage.reachCourseManagerPage();
        // Search the title of the course on search box
        qualitydemyUserCoursePage.searchTextBox.sendKeys(ConfigReader.getProperty("searchedTitle"));

        // Test that course should be able to listed and selected
        //ReusableMethods.waitForIt(2);
        String expectedCourTitle = ConfigReader.getProperty("searchedTitle");
        String actualCourseTitle = qualitydemyUserCoursePage.titleOfCourserAfterSearch.getText();
        Assert.assertTrue(actualCourseTitle.contains(expectedCourTitle));

    }
}
