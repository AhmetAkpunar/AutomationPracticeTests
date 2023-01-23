package US19;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyGirisSayfasiPage;
import pages.QualitydemyUserCoursePage;
import pages.QualitydemyUserPackage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class TC01 {

    QualitydemyGirisSayfasiPage qualitydemyGirisSayfasiPage = new QualitydemyGirisSayfasiPage();
    QualitydemyUserPackage qualitydemyUserPackage = new QualitydemyUserPackage();
    QualitydemyUserCoursePage qualitydemyUserCoursePage = new QualitydemyUserCoursePage();

    @Test(testName = "User Story 19_TC01")
    public void test01(){
        //1-Navigate to qualitydemy home page
        //2-User must successfully login to the webpage
        //3-Click on instructor link on nav-bar
        //4-Click on Course manager at Navigation menü
        qualitydemyUserCoursePage.reachCourseManagerPage();
        //5-Select  appropriate value from Categories filter
        Select categoriesDdm = new Select(qualitydemyUserCoursePage.categoriesDdmElement);
        categoriesDdm.selectByVisibleText("HTML5 and CSS");

        //6-Select  appropriate value from Status filter
        Select statusDdm = new Select(qualitydemyUserCoursePage.statusDdmElement);
        statusDdm.selectByVisibleText("Active");
        //7-Select  appropriate value from Price filter
        Select priceDdm = new Select(qualitydemyUserCoursePage.priceDdmElement);
        priceDdm.selectByVisibleText("Paid");
        //8-Click on filter button
        qualitydemyUserCoursePage.filterButton.click();
        qualitydemyUserCoursePage.pageDown();
        //9-Test that relevant course is displayed//
        String expectedCourseTitle= ConfigReader.getProperty("searchedTitle");
        String actualCourseTitle= qualitydemyUserCoursePage.titleOfCourseAfterFilter.getText();
        Assert.assertTrue(actualCourseTitle.contains(expectedCourseTitle));
    }
}
