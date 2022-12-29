package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoDropDown {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spicejet.com/");
        Thread.sleep(2000);
        WebElement from=driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div/div[2]/input"));
        Thread.sleep(2000);
        from.sendKeys("Dhara");
        Thread.sleep(2000);
//        from.sendKeys(Keys.ARROW_DOWN);
//        Thread.sleep(2000);
//        from.sendKeys(Keys.ENTER);
        WebElement to=driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[1]/div[2]/input"));
        Thread.sleep(2000);
        to.sendKeys("Gorakhpur");
//        Thread.sleep(2000);
//        from.sendKeys(Keys.ARROW_DOWN);
//        Thread.sleep(2000);
//        from.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.quit();

    }
}
