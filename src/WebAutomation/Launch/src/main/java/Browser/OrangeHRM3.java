package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM3 {

    static WebDriver driver;

    static void launch() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HHRA1231\\Downloads\\Apps\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        System.out.println("Browser has been launched successfully");
    }

    static void login() throws InterruptedException {
        driver.findElement(By.xpath("//*[@*='username']")).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@*='password']")).sendKeys("admin123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@*='submit']")).click();
        System.out.println("Login has been successful");
    }

//    static void profile() throws InterruptedException {
//        driver.findElement(By.linkText("Paul Collings")).click();
//        System.out.println("Profile opened successfully");
//        Thread.sleep(2000);
//    }

    static void admin() throws InterruptedException {
        WebElement Admin=driver.findElement(By.xpath("//*[@*='oxd-text oxd-text--span oxd-main-menu-item--name']"));
        Admin.click();
        Thread.sleep(2000);
        driver.quit();
    }


    public static void main(String[] args) throws InterruptedException {
        launch();
        login();
        //profile();
        admin();
    }

}
