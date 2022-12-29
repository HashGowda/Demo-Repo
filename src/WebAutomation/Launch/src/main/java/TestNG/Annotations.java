package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Annotations {

    @Test
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.id("alertButton"));
        element.click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        alert.accept();
        Thread.sleep(2000);
        driver.quit();
    }
}
