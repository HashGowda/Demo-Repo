package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.orangehrm.com/hris-hr-software-demo/");

        driver.findElement(By.xpath("//*[@name='FullName']")).sendKeys("Test");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@*='Email']")).sendKeys("Testuser@gmail.com");
        Thread.sleep(2000);

        WebElement dropDown=driver.findElement(By.xpath("//*[@*='Country']"));
        Select select=new Select(dropDown);
        Thread.sleep(2000);

        select.selectByValue("India");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@*='Contact']")).sendKeys("8976543201");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@*='action_submitForm']")).click();
        Thread.sleep(2000);
        driver.quit();

    }
}
