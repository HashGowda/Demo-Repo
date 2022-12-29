package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SugarCRM {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.sugarcrm.com/au/request-demo/");
        WebElement Btn=driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"));
        Btn.click();

        WebElement Ddown=driver.findElement(By.name("awareness_source_c"));
        Select select=new Select(Ddown);
        Thread.sleep(2000);

        select.selectByValue("Podcast");

        select.selectByVisibleText("Podcast");

        select.selectByIndex(2);
        Thread.sleep(2000);
        driver.quit();
    }
}
