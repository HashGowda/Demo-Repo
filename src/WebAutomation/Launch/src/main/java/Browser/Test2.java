package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Test2 {

    static WebDriver driver;

    static void launch(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HHRA1231\\Downloads\\Apps\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
    }

    static void search() throws InterruptedException {
        driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Selenium");
        Thread.sleep(2000);
        driver.findElement(By.className("wikipedia-search-button")).click();
    }

    static void datePicker() throws InterruptedException {
            driver.findElement(By.xpath("//*[@*='datepicker']")).click();
            Thread.sleep(2000);
    }

    static void dropDown1() throws InterruptedException {
        WebElement DropDown1=driver.findElement(By.xpath("//select[@id='speed']"));
        Select select=new Select(DropDown1);
        select.selectByIndex(2);
        Thread.sleep(2000);
    }

    static void dropDown2() throws InterruptedException{
        WebElement DropDown2=driver.findElement(By.xpath("//select[@id='files']"));
        Select select=new Select(DropDown2);
        select.selectByValue("3");
        Thread.sleep(2000);
    }

    static void dropDown3() throws InterruptedException{
        WebElement DropDown3=driver.findElement(By.xpath("//select[@id='number']"));
        Select select=new Select(DropDown3);
        select.selectByIndex(4);
        Thread.sleep(2000);
    }

    static void dropdown4() throws InterruptedException {
        WebElement DropDown4=driver.findElement(By.xpath("//*[@*='products']"));
        Select select=new Select(DropDown4);
        select.selectByIndex(3);
        Thread.sleep(2000);
    }

    static void dropDown5() throws InterruptedException {
        WebElement DropDown5=driver.findElement(By.xpath("//*[@*='animals']"));
        Select select=new Select(DropDown5);
        select.selectByValue("avatar");
        Thread.sleep(2000);
    }

    static void age() throws InterruptedException {
        driver.findElement(By.id("age")).sendKeys("28");
        Thread.sleep(2000);
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        launch();
        search();
        datePicker();
        dropDown1();
        dropDown2();
        dropDown3();
        dropdown4();
        dropDown5();
        age();
    }
}
