package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MutlulukKutusuPage {

    public MutlulukKutusuPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='nav-top-link nav-top-not-logged-in is-small']")
    public WebElement ilkGirisYap;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement emailKutusu;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement pwKutusu;

    @FindBy(xpath = "//button[@class='woocommerce-button button woocommerce-form-login__submit']")
    public WebElement girisYap;

    @FindBy(xpath = "(//span[@class='header-account-title'])[1]")
    public WebElement gecerliGiris;

    @FindBy(xpath = "//span[text()='Nostalji KUTULARI']")
    public WebElement mutlulukKutusuYazisi;

    @FindBy(xpath = "//h1[@class='product-title product_title entry-title']")
    public WebElement cimAdamUrunAdi;

    @FindBy(xpath = "(//bdi)[2]")
    public WebElement cimAdamUrunFiyati;

    @FindBy(xpath = "//a[text()='Nostalji Dolu Çim Adamlı Lezzet Ve Oyuncak Kutusu']")
    public WebElement cimAdamUrun;


    @FindBy(xpath = "//input[@id='woocommerce-product-search-field-0']")
    public WebElement aramaKutusu;

    @FindBy(xpath = "(//a[text()='Çıkış'])[1]")
    public WebElement cikisbutonu;

    @FindBy(xpath = "//a[text()='Onaylayın ve çıkış yapın']")
    public WebElement cikisOnayButonu;

    // projeye eklenecekler
    @FindBy(xpath = "//*[@id='menu-item-21276']")
    public WebElement konseptKutular;

    @FindBy (xpath = "//*[@class='orderby']")
    public WebElement siralamDdm;

    @FindBy(xpath = "//option[@selected='selected']")
    public WebElement actualSecenekYazisi;
}
