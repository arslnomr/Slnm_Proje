package Proje1;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class First_Proje extends BaseDriver {
    @Test
    public void test1(){
        driver.get("https://www.akakce.com");

        WebElement link=driver.findElement(By.linkText("Hesap Aç"));
        link.click();
        MyFunc.Bekle(1);

        WebElement name=driver.findElement(By.xpath("//input[@id='rnufn']"));
        name.sendKeys("ömer");
        MyFunc.Bekle(1);

        WebElement surName=driver.findElement(By.xpath("//input[@id='rnufs']"));
        surName.sendKeys("Arslan");
        MyFunc.Bekle(1);

        WebElement eMail=driver.findElement(By.xpath("//input[@id='rnufe1']"));
        eMail.sendKeys("bagerooo@gmail.com");
        MyFunc.Bekle(1);

        WebElement againEMail=driver.findElement(By.cssSelector("[id='rnufe2']"));
        againEMail.sendKeys("bagerooo@gmail.com");
        MyFunc.Bekle(1);

        WebElement password=driver.findElement(By.id("rnufp1"));
        password.sendKeys("Ömer.492");
        MyFunc.Bekle(1);

        WebElement againPasswrd=driver.findElement(By.id("rnufp2"));
        againPasswrd.sendKeys("Ömer.492");
        MyFunc.Bekle(1);

        WebElement gender=driver.findElement(By.xpath("//label[text()=' Erkek']"));
        gender.click();
        MyFunc.Bekle(1);

        WebElement selectCity=driver.findElement(By.cssSelector("select[id='locpr']"));

        Select sCity=new Select(selectCity);
        //select[id='locpr']>:nth-child(62)
        //sCity.selectByValue("49");
        sCity.selectByVisibleText("Muş");
        MyFunc.Bekle(1);

        WebElement township= driver.findElement(By.name("locds"));
        Select nTownship=new Select(township);
        nTownship.selectByValue("667");

        WebElement day=driver.findElement(By.xpath("//select[@id='bd']/option[4]"));
        day.click();
        MyFunc.Bekle(1);

        WebElement month=driver.findElement(By.cssSelector("select[id='bm']>:nth-child(10)"));
        month.click();
        MyFunc.Bekle(1);

        WebElement year=driver.findElement(By.xpath("//option[@value='1998']"));
        year.click();
        MyFunc.Bekle(1);

        WebElement select=driver.findElement(By.id("rnufpca"));
        select.click();
        MyFunc.Bekle(1);

        //WebElement againSelect=driver.findElement(By.name("rnufnee"));
        //year.click();
        //MyFunc.Bekle(1);

        WebElement openAccount=driver.findElement(By.cssSelector("input[id='rfb']"));
        openAccount.click();
        MyFunc.Bekle(1);

        WebElement account=driver.findElement(By.linkText("Ömer"));
        account.click();
        MyFunc.Bekle(1);

        WebElement message=driver.findElement(By.linkText("Mesajlarım"));
        message.click();
        MyFunc.Bekle(1);

        driver.navigate().back();
        driver.navigate().back();

        WebElement order2=driver.findElement(By.linkText("Ömer"));
        order2.click();
        MyFunc.Bekle(1);

        WebElement removeAccount=driver.findElement(By.linkText("Hesabımı Sil"));
        removeAccount.click();
        MyFunc.Bekle(1);

        WebElement removePassword=driver.findElement(By.xpath("//input[@id='p']"));
        removePassword.sendKeys("Ömer.492");
        MyFunc.Bekle(1);

        WebElement removeAccount2=driver.findElement(By.cssSelector("[id='u']"));
        removeAccount2.click();
        MyFunc.Bekle(1);

        driverBekleKapat();
    }
}
