package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

    public WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        Frames frames=new Frames();
        frames.launchBrowser();
        frames.handleFrames();
    }

    void launchBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/frames");
        Thread.sleep(3000);
    }

    void handleFrames() throws InterruptedException {
        WebElement frame=driver.findElement(By.id("frame1"));
        driver.switchTo().frame(frame);
        String text=driver.findElement(By.id("sampleHeading")).getText();
        System.out.println("Text : "+text);
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//*[text()='Alerts']")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
