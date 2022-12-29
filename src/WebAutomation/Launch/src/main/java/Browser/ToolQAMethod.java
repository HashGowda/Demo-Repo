package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolQAMethod {

    static WebDriver driver;

    static void launch() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HHRA1231\\Downloads\\Apps\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
    }

static void name() throws InterruptedException {
    WebElement firstName = driver.findElement(By.id("firstName"));
    firstName.sendKeys("Test");
    Thread.sleep(3000);
    driver.findElement(By.id("lastName")).sendKeys("Name");
    Thread.sleep(3000);
}

static void details() throws InterruptedException {
    driver.findElement(By.id("userEmail")).sendKeys("Testname@gmail.com");
    driver.findElement(By.id("userNumber")).sendKeys("9985454578");
    Thread.sleep(2000);
}

static void Dob() throws InterruptedException {
    WebElement dob = driver.findElement(By.id("dateOfBirthInput"));
    System.out.println("DOB : " + dob.getAttribute("value"));
    Thread.sleep(2000);
}

static void address() throws InterruptedException {
        WebElement Address=driver.findElement(By.id("currentAddress"));
        System.out.println("Current address : "+Address.getAttribute("placeholder"));
      //  driver.findElement(By.className(" css-2b097c-container")).sendKeys("Automation");
        driver.findElement(By.id("currentAddress")).sendKeys("Bengaluru");
        Thread.sleep(3000);
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        launch();
        name();
        details();
        Dob();
        address();
    }
}
