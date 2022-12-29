package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

    static WebDriver driver;

    static void launch() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HHRA1231\\Downloads\\Apps\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://itera-qa.azurewebsites.net/home/automation");
    }

    static void login() throws InterruptedException {
        driver.findElement(By.xpath("//*[@*='name']")).sendKeys("Testuser");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='phone']")).sendKeys("9845689712");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@*='email']")).sendKeys("Testuser@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@*='password']")).sendKeys("testuser123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='address']")).sendKeys("Bengaluru");
        Thread.sleep(2000);
    }

    static void radioBtn1() throws InterruptedException {
        WebElement radio1 = driver.findElement(By.xpath("(//*[@*='optionsRadios'])[2]"));
        radio1.click();
        System.out.println("Radio1 Button is selected " + radio1.isSelected());
        Thread.sleep(2000);
    }

    static void checkerBox1() throws InterruptedException {
        WebElement checker1 = driver.findElement(By.xpath("(//*[@*='form-check-input'])[7]"));
        checker1.click();
        System.out.println("Checker Box1 is selected " + checker1.isSelected());
        Thread.sleep(2000);
    }

    static void dropDown() throws InterruptedException {
        WebElement dropdown = driver.findElement(By.xpath("//*[@*='custom-select']"));
        Select select = new Select(dropdown);
        select.selectByValue("6");
        Thread.sleep(2000);
    }

    static void radioBtn2() throws InterruptedException {
        WebElement radio2 = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]"));
        radio2.click();
        System.out.println("Radio2 Button is selected " + radio2.isSelected());
        Thread.sleep(2000);
    }

    static void checkerBox2() throws InterruptedException {
        WebElement checker2 = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[6]"));
        checker2.click();
        System.out.println("Checker Box2 is selected " + checker2.isSelected());
        Thread.sleep(2000);
    }

    static void upload() throws InterruptedException {
        WebElement file = driver.findElement(By.xpath("//*[@class='custom-file-input']"));
        file.sendKeys("C:\\Users\\HHRA1231\\Pictures\\Screenshots\\1.jpg");
        //file.click();
        Thread.sleep(2000);
        WebElement Upload = driver.findElement(By.xpath("//*[@class='input-group-text']"));
        Upload.click();
        System.out.println("File is uploaded successfully");
        Thread.sleep(2000);
    }

    static void submit() throws InterruptedException {
        driver.findElement(By.xpath("//*[@name='submit']")).click();
        Thread.sleep(2000);
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        launch();
        login();
        radioBtn1();
        checkerBox1();
        dropDown();
        radioBtn2();
        checkerBox2();
        upload();
        submit();
    }
}


