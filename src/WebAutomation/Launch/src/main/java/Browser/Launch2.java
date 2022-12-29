package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch2 {

    //@TestSearch

    //public static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\HHRA1231\\Downloads\\Apps\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.ebay.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("_nkw")).sendKeys("Mobiles");
        driver.findElement(By.id("gh-btn")).click();
       // driver.findElement(By.name("q")).sendKeys("Men Shoes");
       // driver.findElement(By.className("icon")).click();
        //driver.findElement(By.;
    }
}
