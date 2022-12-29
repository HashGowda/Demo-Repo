package Browser;

import org.junit.jupiter.params.shadow.com.univocity.parsers.tsv.TsvRoutines;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker3 {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        String exp_date="10-October-2020";
        String exp_month=exp_date.split("-")[1];
        String exp_year=exp_date.split("-")[2];
        String exp_day=exp_date.split("-")[0];
        System.out.println(exp_month+"****"+exp_year+"****"+exp_day);

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HHRA1231\\Downloads\\Apps\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spicejet.com/");

        WebElement destination=driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div/div[2]/input"));
        destination.sendKeys("Ben");
        Thread.sleep(2000);

        WebElement date=driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div/div[1]/div[2]/div[1]"));
        date.click();
        Thread.sleep(2000);

        String Date=driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div[3]/div[3]/div[3]/div/div")).getText();
        System.out.println(Date);
        String Date2[]=Date.split("\n");
        String Month=Date2[0];
        String Year=Date2[1];
        System.out.println(Month+ Year);

       // while (!Date.equals(exp_month)){

        //}
    }
}
