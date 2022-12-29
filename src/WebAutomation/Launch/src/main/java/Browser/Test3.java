package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {
    static WebDriver driver;

    static void launch() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HHRA1231\\Downloads\\Apps\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.airindia.in/");
        Thread.sleep(2000);
    }

    static void dropDown() throws InterruptedException {
        WebElement Dropdown=driver.findElement(By.xpath("(//*[@*='form-control'])[4]"));
        Select select=new Select(Dropdown);
        select.selectByValue("Student");
        Thread.sleep(2000);
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        launch();
        dropDown();
    }
}
