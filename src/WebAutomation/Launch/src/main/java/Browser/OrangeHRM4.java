package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class OrangeHRM4 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);

        driver.findElement(By.name("username")).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("admin123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(@class,'oxd-button')]")).click();
        Thread.sleep(3000);

        WebElement performance=driver.findElement(By.xpath("//span[text()='Performance']"));
        performance.click();
        Thread.sleep(3000);

        WebElement drop=driver.findElement(By.xpath("(//*[@*='oxd-select-text-input'])[1]"));
        drop.click();
        Select select=new Select(drop);
        //select.selectByIndex(4);
        drop.sendKeys("Head of Support");
        Thread.sleep(3000);
        drop.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
        Thread.sleep(3000);
//        List<WebElement> dropDown=driver.findElements(By.xpath("(//*[@*='oxd-select-text-input'])[1]"));
//        for(int i=0; i<dropDown.size();i++){
//            String list=dropDown.get(i).getText();
//            System.out.println(list);
//            Thread.sleep(3000);
//        }
        driver.quit();
    }
}
