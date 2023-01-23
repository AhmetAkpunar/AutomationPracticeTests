package US19;

import org.testng.annotations.Test;
import pages.QualitydemyUserCoursePage;

public class TC_Delete_Deneme {
    QualitydemyUserCoursePage qualitydemyUserCoursePage = new QualitydemyUserCoursePage();


    @Test
    public void test_delete(){

        qualitydemyUserCoursePage.reachCourseManagerPage();
        qualitydemyUserCoursePage.courseDelete(4,"Cyber");

    }
}
