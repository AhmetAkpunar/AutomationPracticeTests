package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualitydemyUserPackage {

    public QualitydemyUserPackage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[text()='Course manager']")
    public WebElement userCourseManagerLinki;

    @FindBy(xpath = "//*[text()='Add new course']")
    public WebElement userAddNewCourseLinki;

    @FindBy(xpath = "//*[@id='course_title']")
    public WebElement userCourseTitleBox;

    @FindBy(xpath = "//*[@id='short_description']")
    public WebElement userShortDescriptionBox;

    @FindBy(xpath = "//*[@class='note-editable card-block']")
    public WebElement userDescriptionBox;

    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[1]")
    public WebElement userCategoryDropdown;

    @FindBy(xpath = "//li[text()='Piano']")
    public WebElement userSelectCategoryPiano;

    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[2]")
    public WebElement userLevelDropdown;

    @FindBy(xpath = "//li[text()='Intermediate']")
    public WebElement userSelectLevel;

    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[3]")
    public WebElement userLanguageDropdown;

    @FindBy(xpath = "(//*[@for='enable_drip_content'])[2]")
    public WebElement userEnableDripContentButton;

    @FindBy(xpath = "(//*[@class='custom-control-label'])[1]")
    public WebElement userTopCourseCheckBox;


}