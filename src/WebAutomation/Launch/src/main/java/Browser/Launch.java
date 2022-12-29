package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\HHRA1231\\Downloads\\Apps\\chromedriver.exe");

        driver=new ChromeDriver();
        driver.get("http://www.ebay.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("gh-ac")).sendKeys("mobiles");
        driver.findElement(By.id("gh-btn")).click();
        Thread.sleep(3000);
        driver.quit();
       // driver.findElement(By.className("s-page no-touch skin-large srp--list-view gh-flex")).click();
    }
}


