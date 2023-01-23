package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MutlulukKutusuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.File;
import java.util.List;

public class ChromeExtensions {

        MutlulukKutusuPage mutlulukKutusuPage = new MutlulukKutusuPage();

    @Test
    public void test04(){
        // test04 Ahmet

        // 1- https://www.mutlulukkutusu.com/ adresine gidin.
        Driver.getDriver().get(ConfigReader.getProperty("mkUrl"));

        // 2- giriş yap butonunun secilebilir oldugunu test edin.
        Assert.assertTrue(mutlulukKutusuPage.ilkGirisYap.isEnabled());
        mutlulukKutusuPage.ilkGirisYap.click();

        // 3- dogru kullanici adi ve dogru sifreyi girin.
        mutlulukKutusuPage.emailKutusu.sendKeys(ConfigReader.getProperty("mkGecerliEmail"));
        mutlulukKutusuPage.pwKutusu.sendKeys(ConfigReader.getProperty("mkGecerliPassword"));

        // 4- giris yap'a tiklayin.
        mutlulukKutusuPage.girisYap.click();

        // 5- Konsept kutular kategorisine tiklayin
        //ReusableMethods.bekle(1);
        mutlulukKutusuPage.konseptKutular.click();

        // 6- sağdaki siralama seceneginden "Düsükten Yüksege" secenegini secin.
        Select select = new Select(mutlulukKutusuPage.siralamDdm);
        select.selectByValue("price");

        // 7- "Düsükten Yüksege"  seceneginin secildigini dogrulayin
        String expectedKelime ="Düşükten yükseğe";
        WebElement actualSecenekYazisi = mutlulukKutusuPage.actualSecenekYazisi;
        Assert.assertTrue(actualSecenekYazisi.getText().contains(expectedKelime));

        // 8- Birinci ürün fiyatinin son ürün fiyatindan düsük oldugunu test edin.
        List<WebElement> urunListesi = Driver.getDriver().findElements(By.xpath("//span[@class='woocommerce-Price-amount amount']"));
        String[] urunFiyatArr = new String[urunListesi.size()];
        int index =0;
        for (WebElement eachElement:urunListesi) {
            urunFiyatArr[index] = eachElement.getText();
            index++;
        }

        String ilkUrunFiyat = urunFiyatArr[0].replaceAll("\\D","");
        String sonUrunFiyat =urunFiyatArr[urunFiyatArr.length-1].replaceAll("\\D","");
        Assert.assertTrue(Integer.parseInt(sonUrunFiyat) > Integer.parseInt(ilkUrunFiyat));
    }

}
