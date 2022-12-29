package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/upload/");
        Thread.sleep(2000);
        WebElement chooseFile=driver.findElement(By.name("uploadfile_0"));
        chooseFile.sendKeys("C:\\Users\\HHRA1231\\Documents\\Marmoset\\Image.png");
        Thread.sleep(2000);
        driver.findElement(By.id("terms")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("send")).click();
        Thread.sleep(2000);
        WebElement text=driver.findElement(By.className("demo"));
        String message=text.getText();
        System.out.println(message);
        Thread.sleep(2000);
        driver.quit();
    }
}
