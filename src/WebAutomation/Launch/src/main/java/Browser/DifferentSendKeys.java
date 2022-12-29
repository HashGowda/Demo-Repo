package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DifferentSendKeys {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://in.puma.com/in/en");
        Thread.sleep(3000);
        WebElement search=driver.findElement(By.xpath("//*[@type='search']"));

        //Javascript sendkeys
        JavascriptExecutor executor=(JavascriptExecutor) driver;
        executor.executeScript("arguments[0].value='Shoes';", search);
        Thread.sleep(3000);
        search.clear();
        Thread.sleep(2000);

        //Selenium sendkeys
        search.sendKeys("Mens shoes");
        Thread.sleep(3000);
        search.clear();
        Thread.sleep(3000);

//        //Actions class sendkeys
//        Actions actions=new Actions(driver);
//        actions.sendKeys(search,"Womens shoes").perform();
//        Thread.sleep(3000);
//
//        //Javascript click
//        WebElement element=driver.findElement(By.className("text-3xl w-[1em] h-[1em] text-white fill-current"));
//        executor.executeScript("arguments[0].click();", element);
//        Thread.sleep(3000);
        driver.quit();
    }
}
