package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualitydemyGirisSayfasiPage {
    public QualitydemyGirisSayfasiPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement girisIlkLoginLink;

    @FindBy(xpath = "//*[text()='Accept']")
    public WebElement girisCookieLink;

    @FindBy(xpath = "//input[@id='login-email']")
    public WebElement girisEmailBox;

    @FindBy(xpath = "//input[@id='login-password']")
    public WebElement girisPasswordBox;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement girisLoginLink;

}