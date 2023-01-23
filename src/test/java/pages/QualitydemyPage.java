package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class QualitydemyPage {

    public QualitydemyPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    //qa.qualitydemy.com> Log in Linki
    @FindBy(xpath = "//*[text()='Log in']")
    private WebElement ilkLoginLinki;

    //qa.qualitydemy.com> cookie element
    @FindBy(xpath = "//*[text()='Accept']")
    private WebElement cookieAccept;

    //qa.qualitydemy.com> EmailTextBox Element
    @FindBy(id = "login-email")
    private WebElement emailTextbox;

    //qa.qualitydemy.com> PasswordTextBox Element
    @FindBy(id = "login-password")
    private WebElement passwordTextbox;

    //qa.qualitydemy.com> Login button Elementi
    @FindBy(xpath="//*[@class='btn red radius-5 mt-4 w-100']")
    private WebElement loginButtonu;

    //qa.qualitydemy.com> Login > Instructor linki
    @FindBy(xpath = "//*[text()='Instructor']")
    private WebElement anasayfaInstructorLinki;

    //qa.qualitydemy.com> Login> Instructor> Course Manager
    @FindBy(xpath = "//*[text()='Course manager']")
    private WebElement courseManagerSection;

    //qa.qualitydemy.com> Login> Instructor> Course Manager> Categories
    @FindBy(id = "category_id")
    public WebElement categoriesDdmElement;

    //qa.qualitydemy.com> Login> Instructor> Course Manager> Status
    @FindBy(id="status")
    public WebElement statusDdmElement;

    //qa.qualitydemy.com> Login> Instructor> Course Manager> Price
    @FindBy(id="price")
    public WebElement priceDdmElement;

    //qa.qualitydemy.com> Login> Instructor> Course Manager> Filter Buttonu
    @FindBy(xpath = "//*[text()='Filter']")
    public WebElement filterButton;

    //qa.qualitydemy.com> Login> Instructor> Course Manager> Title of course
    @FindBy (xpath = "//tbody/tr/td[2]")
    public WebElement titleOfCourseAfterFilter;

    //qa.qualitydemy.com> Login> Instructor> Course Manager> Title of course after filtered
    @FindBy(xpath = "//tbody/tr/td[2]")
    public WebElement titleOfCourserAfterSearch;

    //qa.qualitydemy.com> Login>> Instructor linki>> Course Manager> Search Texbox
    @FindBy(xpath = "//*[@type='search']")
    public WebElement searchTextBox;

    //qa.qualitydemy.com> Login>> Instructor>> Course Manager>>
    @FindBy (xpath ="(//*[@class='dropright dropright'])[1]")
    public WebElement threeDotsButton;


    //qa.qualitydemy.com> Login> Instructor linki> Course Manager> Threedots>
    // View course on fronted
    @FindBy(xpath = "(//*[text()='View course on frontend'])[1]")
    public WebElement courseOnFrontedLink;

    //qa.qualitydemy.com> Login> Instructor linki> Course Manager> Threedots>
    // Go to course playing page
    @FindBy(xpath = "(//*[text()='Go to course playing page'])[1]")
    public WebElement goToCoursePlayingPage;

    //qa.qualitydemy.com> Login> Instructor> Course Manager> Threedots> Edit this course
    @FindBy(xpath = "(//*[text()='Edit this course'])[1]")
    public WebElement editThisCourseLink;

    //qa.qualitydemy.com> Login> Instructor linki> Course Manager> Threedots> Edit this course
    @FindBy(xpath = "(//div[@class='card-body'])[1]")
    public WebElement editThisCoursePage;

    //qa.qualitydemy.com> Login>> Instructor linki>> Course Manager>> Threedots>> Section and lesson
    @FindBy(xpath = "(//*[text()='Section and lesson'])[1]")
    public WebElement sectionAndLessonLink;

    //qa.qualitydemy.com>> Login>> Instructor linki>> Course Manager>> Threedots>>
    // Section and lesson>> Add Section Button
    @FindBy(xpath = "(//button[@class='btn btn-outline-primary btn-rounded btn-sm ml-1'])[1]")
    public WebElement addSectionButton;

    //qa.qualitydemy.com>> Login>> Instructor linki>> Course Manager>> Threedots>> Mark as Drafted
    @FindBy(xpath = "(//*[text()='Mark as drafted'])[1]")
    public WebElement markAsDraftLink;

    //qa.qualitydemy.com>> Login>> Instructor linki>> Course Manager>> Threedots>>
    // Mark as Drafted>> Confirm message
    @FindBy(xpath = "(//*[text()='Continue'])[1]")
    public WebElement confirmAcceptLink;

    //qa.qualitydemy.com>> Login>> Instructor linki>> Course Manager>> Course List
    // Status column
    @FindBy(xpath = "(//*[@class='badge badge-dark-lighten'])[2]")
    public WebElement statusText;

    //qa.qualitydemy.com>> Login>> Instructor linki>> Course Manager>> Threedots>>
    // Mark as Drafted>> publish this course
    @FindBy(xpath = "//*[text()='Publish this course']")
    public WebElement publishCourseLink;

    //qa.qualitydemy.com>> Login>> Instructor linki>> Course Manager>> Threedots>>
    // Mark as Drafted>> publish this course>> Course Status>> Active
    @FindBy(xpath = "(//*[@class='badge badge-success-lighten'])[1]")
    public WebElement statusActiveElement;

    //qa.qualitydemy.com>> Login>> Instructor linki>> Course Manager>> Threedots>> Delete
    @FindBy(xpath ="(//*[text()='Delete'])[2]")
    public WebElement deleteLink;

    //qa.qualitydemy.com>> Login>> Instructor linki>> Course Manager>> Threedots>> Delete>>
    // 'No matching Record Found' text Element
    @FindBy(xpath = "//tbody/tr/td")
    public WebElement coursesAfterDelete;

    //qa.qualitydemy.com>> Login>> Instructor linki>> Course Manager>> Add new course Button
    @FindBy(xpath = "//*[text()='Add new course']")
    public WebElement addNewCourseButton;

    // qa.qualitydemy.com>> Login>> Instructor linki>> Course Manager>> Add new course Button>>
    // Add new course
    @FindBy(xpath = "//h4[@class='page-title']")
    public WebElement newCourseAddPage;

    //-------------------Basic Section locators-----------------------//

    // qa.qualitydemy.com>> Login>> Instructor linki>> Course Manager>>Click on any course on the
    // course list
    @FindBy(xpath = "(//*[@class='nav-item'])[2]")
    public WebElement basicElement;

    // qa.qualitydemy.com>> Login>> Instructor linki>> Course Manager>> Click on a course on
    // course list >> Basic Section >> Category
    @FindBy(xpath = "//*[@id='select2-sub_category_id-container']")
    public WebElement basicCategoryElement;

    // qa.qualitydemy.com>> Login>> Instructor linki>> Course Manager>> Click on a course on
    // course list >> Basic Section >> Level
    @FindBy(xpath = "//*[@id='select2-level-container']")
    public WebElement basicLevelElement;

    // qa.qualitydemy.com>> Login>> Instructor linki>> Course Manager>> Click on a course on
    // course list >> Basic Section >> Drip Element
    @FindBy(xpath = "(//*[@for='enable_drip_content'])[2]")
    public WebElement basicEnableDripElement;

    // qa.qualitydemy.com>> Login>> Instructor linki>> Course Manager>> Click on a course on
    // course list >> Basic Section >> Is Top course checkbox
    @FindBy(xpath = "//*[@for='is_top_course']")
    public WebElement basicIsTopCourseElement;


    //qa.qualitydemy.com> Login>> Instructor linki>> Course Manager page
    public void reachCourseManagerPage(){
        Driver.getDriver().get(ConfigReader.getProperty("qualityUrl"));
        if (cookieAccept.isDisplayed()) {cookieAccept.click();}
        ilkLoginLinki.click();
        emailTextbox.sendKeys(ConfigReader.getProperty("qualityUser"));
        passwordTextbox.sendKeys(ConfigReader.getProperty("qualityPass"));
        loginButtonu.click();
        anasayfaInstructorLinki.click();
        courseManagerSection.click();
        ReusableMethods.waitForIt(2);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.visibilityOf(loginButtonu)).click();
    }

    public void pageDown(){
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
    }

    public String getWindowHandle(String firstPageWHD){
        String secondWHD="";
        Set<String> allWHD = Driver.getDriver().getWindowHandles();
        for (String eachWHD:allWHD) {
            if (!eachWHD.equals(firstPageWHD)) {
                secondWHD = eachWHD;
            }
        }
        return secondWHD;
    }

    public void linksRedirectsRelevantCoursePage(){
        String expectecTitle = ConfigReader.getProperty("searchedTitle");
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectecTitle));
    }

    public void changeStatusOfCourse(String expectedStatusText){

        String actualStatusText = statusText.getText();
        Assert.assertEquals(expectedStatusText,actualStatusText);

    }

    public void courseDelete(int courseRowNumberInCourseList, String courseTitle){

        ReusableMethods.waitForIt(2);
        Driver.getDriver().findElement(By.xpath(
                "(//*[@class='btn btn-sm btn-outline-primary btn-rounded btn-icon'])" +
                        "["+courseRowNumberInCourseList+"]")).click();
        ReusableMethods.waitForIt(2);
        Driver.getDriver().findElement(By.xpath("(//*[text()='Delete'])" +
                                                        "["+courseRowNumberInCourseList+"]")).click();
        confirmAcceptLink.click();
        searchTextBox.sendKeys(courseTitle);
        String expectedText="No matching records found";
        ReusableMethods.waitForIt(2);
        String actualText=coursesAfterDelete.getText();
        Assert.assertEquals(expectedText,actualText);
    }

    public void redirectsNewCourseAdd(){
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP);
        ReusableMethods.waitForIt(2);
        addNewCourseButton.click();
        Assert.assertTrue(newCourseAddPage.isDisplayed());
    }

    public void redirectsCourseEditPage(int courseRowNumberInCourseList){
        WebElement courseNameElement = Driver.getDriver().findElement(
                By.xpath("//tbody/tr["+courseRowNumberInCourseList+"]/td[2]//a"));
        String courseName = courseNameElement.getText();
        ReusableMethods.waitForIt(2);
        courseNameElement.click();String actualText=
                                          Driver.getDriver().findElement(
                                                  By.xpath("//h4[@class='page-title']")).getText();
        String expectedText ="Update: "+courseName;
        /*
        System.out.println(courseName);
        System.out.println("-----------");
        System.out.println(actualText);
        System.out.println("-----------");
        System.out.println(expectedText);
         */
        Assert.assertEquals(expectedText,actualText);;
    }

    public void addNewInstructor(int courseRowNumberInCourseList){
        WebElement courseNameElement = Driver.getDriver().findElement(
                By.xpath("//tbody/tr["+courseRowNumberInCourseList+"]/td[2]//a"));
        String courseName = courseNameElement.getText();
        ReusableMethods.waitForIt(2);
        courseNameElement.click();
        basicElement.click();
        ReusableMethods.waitForIt(2);
        WebElement instructorTextbox= Driver.getDriver().findElement(
                By.xpath("//*[@class='select2-search__field']"));
        instructorTextbox.click();
        Assert.assertTrue(instructorTextbox.isEnabled());
    }

    public void courseTitleShortDescription(int courseRowNumberInCourseList){
        WebElement courseNameElement = Driver.getDriver().findElement(
                By.xpath("//tbody/tr["+courseRowNumberInCourseList+"]/td[2]//a"));
        String courseName = courseNameElement.getText();
        ReusableMethods.waitForIt(2);
        courseNameElement.click();
        basicElement.click();
        ReusableMethods.waitForIt(2); // Basic section element

        WebElement courseTitleTextBox= Driver.getDriver().findElement(By.xpath("//*[@id"
                                       +"='course_title" +"']"));
        courseTitleTextBox.click();
        ReusableMethods.waitForIt(2);

        WebElement courseShortDescTextbox = Driver.getDriver()
                                   .findElement(By.xpath("//*[@id='short_description']"));
        courseShortDescTextbox.click();
        ReusableMethods.waitForIt(2);
        Actions actions = new Actions(Driver.getDriver());

        WebElement courseDescTextbox = Driver.getDriver()
                                        .findElement(By.xpath("//*[@class='note-editable card-block']"));

        actions.scrollToElement(courseDescTextbox);
        courseDescTextbox.click();
        Assert.assertTrue(courseTitleTextBox.isEnabled());
        Assert.assertTrue(courseShortDescTextbox.isEnabled());
        Assert.assertTrue(courseDescTextbox.isEnabled());
    }

    public void courseCategory(int courseRowNumberInCourseList){
        // course in the listselection
        WebElement courseNameElement = Driver.getDriver().findElement(
                By.xpath("//tbody/tr["+courseRowNumberInCourseList+"]/td[2]//a"));
        String courseName = courseNameElement.getText();
        ReusableMethods.waitForIt(2);
        courseNameElement.click();
        basicElement.click();
        ReusableMethods.waitForIt(2); // Basic section element
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(basicCategoryElement);
        basicCategoryElement.click();
        ReusableMethods.waitForIt(2);
        Assert.assertTrue(basicCategoryElement.isEnabled());

    }

    public void courseLevel(int courseRowNumberInCourseList){
        // course in the listselection
        WebElement courseNameElement = Driver.getDriver().findElement(
                By.xpath("//tbody/tr["+courseRowNumberInCourseList+"]/td[2]//a"));
        String courseName = courseNameElement.getText();
        ReusableMethods.waitForIt(2);
        courseNameElement.click();
        basicElement.click();
        ReusableMethods.waitForIt(2); // Basic section element
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(basicLevelElement);
        basicLevelElement.click();
        ReusableMethods.waitForIt(2);
        Assert.assertTrue(basicLevelElement.isEnabled());
    }

    public void courseEnableDrip(int courseRowNumberInCourseList){
        // course in the listselection
        WebElement courseNameElement = Driver.getDriver().findElement(
                By.xpath("//tbody/tr["+courseRowNumberInCourseList+"]/td[2]//a"));
        String courseName = courseNameElement.getText();
        ReusableMethods.waitForIt(2);
        courseNameElement.click();
        basicElement.click();
        ReusableMethods.waitForIt(2);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
        ReusableMethods.waitForIt(1);
        basicEnableDripElement.click();
        Assert.assertTrue(basicEnableDripElement.isEnabled());

    }

    public void courseIsTopCourse(int courseRowNumberInCourseList){
        // course in the listselection
        WebElement courseNameElement = Driver.getDriver().findElement(
                By.xpath("//tbody/tr["+courseRowNumberInCourseList+"]/td[2]//a"));
        String courseName = courseNameElement.getText();
        ReusableMethods.waitForIt(2);
        courseNameElement.click();
        basicElement.click();
        ReusableMethods.waitForIt(2); // Basic section element
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(basicIsTopCourseElement);
        ReusableMethods.waitForIt(2);
        basicIsTopCourseElement.click();
        ReusableMethods.waitForIt(2);
        Assert.assertTrue(basicIsTopCourseElement.isEnabled());

    }
}

