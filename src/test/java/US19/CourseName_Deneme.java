package US19;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;

public class CourseName_Deneme {

    QualitydemyPage qualitydemyPage = new QualitydemyPage();

    @Test
    public void courseName(){

        qualitydemyPage.reachCourseManagerPage();
        String courseStatus =
        Driver.getDriver().findElement(By.xpath("//tbody/tr[1]/td[6]//span")).getText();
        String courseStatus2=
        Driver.getDriver().findElement(By.xpath("//tbody/tr[2]/td[6]//span")).getText();
        System.out.println(courseStatus);
        System.out.println(courseStatus2);
        Driver.getDriver().findElement(By.xpath("//tbody/tr[1]/td[8]//button")).click();

        //String courseName = qualitydemyPage.getCourseName(2);
        //System.out.println(courseName);

    }
}
