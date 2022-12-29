package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Year;
import java.util.Date;
import java.util.Set;

public class DatePick {

    public WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        DatePick datePick=new DatePick();
        datePick.launchBrowser();
        datePick.datePicker();
        datePick.selectedDate();
        datePick.dateAndTime();
        datePick.selectedDateAndTime();
    }
    void launchBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/date-picker");
        Thread.sleep(3000);
    }
    void datePicker() throws InterruptedException {
        driver.findElement(By.id("datePickerMonthYearInput")).click();
        Thread.sleep(3000);

        WebElement Month = driver.findElement(By.className("react-datepicker__month-select"));
        Select month = new Select(Month);
        month.selectByValue("0");
        Thread.sleep(3000);

        WebElement Year = driver.findElement(By.className("react-datepicker__year-select"));
        Select year = new Select(Year);
        year.selectByVisibleText("1994");
        Thread.sleep(3000);

        WebElement Day = driver.findElement(By.xpath("//*[text()='27']"));
        Day.click();
        Thread.sleep(3000);
    }

    void selectedDate() throws InterruptedException {
        WebElement date=driver.findElement(By.xpath("(//*[@type='text'])[1]"));
        String Date=date.getAttribute("value");
        System.out.println("Selected date : "+Date);
        Thread.sleep(3000);
    }
    void dateAndTime() throws InterruptedException {
        driver.findElement(By.id("dateAndTimePickerInput")).click();
        Thread.sleep(3000);

        WebElement Month = driver.findElement(By.xpath("//div[@class='react-datepicker__month-read-view']"));
        Month.click();
        Select month = new Select(Month);
        month.selectByIndex(1);
        Thread.sleep(3000);

        WebElement Year = driver.findElement(By.xpath("//div[@class='react-datepicker__year-read-view']"));
        Year.click();
        Select year = new Select(Year);
        year.selectByVisibleText("1998");
        Thread.sleep(3000);

        WebElement Day= driver.findElement(By.xpath("//*[text()='16']"));
        Day.click();
        Thread.sleep(3000);

        WebElement Time=driver.findElement(By.className("react-datepicker__time-list-item "));
        Select time=new Select(Time);
        time.selectByValue("02:00");
        Thread.sleep(3000);
    }

    void selectedDateAndTime() throws InterruptedException {
        WebElement DateAndTime=driver.findElement(By.xpath("(//*[@type='text'])[2]"));
        String dateAndTime=DateAndTime.getAttribute("value");
        System.out.println("Selected Date and Time : "+dateAndTime);
        Thread.sleep(3000);
        driver.quit();
    }
}
