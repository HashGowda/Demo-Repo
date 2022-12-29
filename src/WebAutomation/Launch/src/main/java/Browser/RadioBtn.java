package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtn {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");

        WebElement pageHeader = driver.findElement(By.className("main-header"));
        String header = pageHeader.getText();
        System.out.println("Page Header : " + header);

        driver.findElement(By.id("firstName")).sendKeys("Test");
        driver.findElement(By.id("lastName")).sendKeys("User");
        Thread.sleep(2000);
        driver.findElement(By.id("userEmail")).sendKeys("Testuser@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("userNumber")).sendKeys("9876543210");
        Thread.sleep(2000);

        WebElement dob = driver.findElement(By.id("dateOfBirthInput"));
        String DOB = dob.getAttribute("value");
        System.out.println("Date of Birth : " + DOB);

        WebElement textArea = driver.findElement(By.id("currentAddress"));
        System.out.println("Current Address : " + textArea.getAttribute("placeholder"));

        WebElement radioBtn2 = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]"));
        radioBtn2.click();
        System.out.println(radioBtn2.isSelected());
        Thread.sleep(2000);

        WebElement radioBtn5 = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[5]"));
        radioBtn5.click();
        System.out.println(radioBtn5.isSelected());
        Thread.sleep(2000);
        driver.quit();
    }
}

