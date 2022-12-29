package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitBtn {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/login.html");

        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Testemail@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("testuser@123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@name='SubmitLogin']")).submit();
        Thread.sleep(2000);
        System.out.println("Login submit is done");
        Thread.sleep(2000);
        driver.quit();

    }
}
