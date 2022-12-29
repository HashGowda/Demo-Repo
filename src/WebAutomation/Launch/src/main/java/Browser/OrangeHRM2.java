package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM2 {

    static WebDriver driver;

    static void launch() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HHRA1231\\Downloads\\Apps\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
    }

    static void login() throws InterruptedException {
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
    }

    static void admin() throws InterruptedException {
        WebElement Admin=driver.findElement(By.xpath("//*[@*='oxd-text oxd-text--span oxd-main-menu-item--name']"));
        Admin.click();
        Thread.sleep(2000);
    }

    static void username() throws InterruptedException {
        WebElement userName=driver.findElement(By.xpath("(//*[@*='oxd-input oxd-input--active'])[2]"));
        userName.sendKeys("Abhishek");
        Thread.sleep(2000);
    }

    static void dropDown() throws InterruptedException {
        WebElement Dropdown=driver.findElement(By.xpath("(//*[@*='oxd-select-text-input'])[1]"));
        Dropdown.click();
        Select select=new Select(Dropdown);
        select.selectByVisibleText("ESS");
        Thread.sleep(2000);
    }

    static void name() throws InterruptedException {
        WebElement Name=driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
        Name.sendKeys("Abhishek");
        Thread.sleep(2000);
    }

    static void status() throws InterruptedException {
        WebElement Status=driver.findElement(By.xpath("(//*[@*='oxd-select-text-input'])[1]"));
        Select select=new Select(Status);
        select.selectByVisibleText("Enabled");
        Thread.sleep(2000);
    }

    static void search() throws InterruptedException {
        WebElement Search=driver.findElement(By.xpath("//*[@*='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
        Search.click();
        Thread.sleep(2000);
        //driver.quit();
    }

    static void Checkerbox() throws InterruptedException {
        WebElement checkerBox=driver.findElement(By.xpath("(//*[@*='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input'])[2]"));
        checkerBox.click();
        Thread.sleep(2000);
        //driver.quit();
    }

    static void edit() throws InterruptedException {
        WebElement Edit=driver.findElement(By.xpath("//*[@*='oxd-icon bi-pencil-fill']"));
        Edit.click();
        Thread.sleep(2000);
    }

    static void role() throws InterruptedException {
        WebElement Role=driver.findElement(By.xpath("(//*[@*='oxd-select-text--after'])[1]"));
        Select select=new Select(Role);
        select.selectByIndex(1);
        Thread.sleep(2000);
    }

    static void empName() throws InterruptedException {
        driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Peter Mac Anderson");
        Thread.sleep(2000);
    }

    public static void main(String[] args) throws InterruptedException {
        launch();
        login();
        admin();
        username();
        dropDown();
        name();
        status();
        search();
        Checkerbox();
        edit();
        role();
        empName();
    }
}
