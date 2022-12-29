package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.Set;

public class WindowHandle {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(3000);

        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        Thread.sleep(3000);
        Set<String> handle=driver.getWindowHandles();
        Iterator<String> itr=handle.iterator();
        String mainWindow= itr.next();
        String childWindow= itr.next();
        driver.switchTo().window(childWindow);
        Thread.sleep(3000);

        //code to execute in Sub tab
        driver.findElement(By.xpath("(//*[text()='Book a Free Demo'])[position()=last()]")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("Form_getForm_FullName")).sendKeys("Testing");
        Thread.sleep(3000);
        driver.close();

        //code to execute in Main tab
        driver.switchTo().window(mainWindow);
        Thread.sleep(3000);
        WebElement userName=driver.findElement(By.xpath("//*[@*='username']"));
        userName.sendKeys("Admin");
        Thread.sleep(2000);
        WebElement password=driver.findElement(By.xpath("//*[@*='password']"));
        password.sendKeys("admin123");
        WebElement loginButton=driver.findElement(By.xpath("//*[contains(@class, 'oxd-button')]"));
        loginButton.click();
        Thread.sleep(3000);
        driver.quit();
    }
}
