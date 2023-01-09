package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PracticeAutomation {

    // Page includes locators

    public PracticeAutomation(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='My Account']")
    public WebElement myAccountLink;

    @FindBy(xpath = "(//ins[@class='adsbygoogle adsbygoogle-noablate'])[4]")
    public WebElement googleAds;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(xpath = "//*[@value='Login']")
    public WebElement login;

    @FindBy(linkText = "Dashboard")
    public WebElement dashboard;

    @FindBy(xpath = "//*[@class='woocommerce-MyAccount-navigation']")
    public WebElement myAccountNavBar;

    @FindBy(xpath = "//*[@class='woocommerce-error']")
    public WebElement invalidLoginError;

}
