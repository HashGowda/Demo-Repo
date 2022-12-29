package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandleDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/popup.php");

        driver.findElement(By.xpath("//*[contains(@href, 'popup.php')]")).click();

        String mainWindow=driver.getWindowHandle();

        Set<String> s1=driver.getWindowHandles();

        Iterator<String> i1=s1.iterator();

        while (i1.hasNext()){
            String childWindow=i1.next();

            if(!mainWindow.equalsIgnoreCase(childWindow)){
                driver.switchTo().window(childWindow);
                Thread.sleep(3000);
                driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
                Thread.sleep(3000);
                driver.findElement(By.name("btnLogin")).click();
                Thread.sleep(3000);
                driver.close();
            }
        }
        driver.switchTo().window(mainWindow);
        Thread.sleep(3000);
        driver.quit();
    }
}
