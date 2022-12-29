package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DatePicker2 {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HHRA1231\\Downloads\\Apps\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.expedia.ca/");

        driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();
        Thread.sleep(2000);

        String month="March 2020";
        String ex_date="25";

        while (true){
            String text=driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]")).getText();

            if(text.equals(month)){
                break;
            }
            else {
                driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/button[2]")).click();
            }
        }

        List<WebElement> allDates=driver.findElements(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr/td/button"));

        for(WebElement ele:allDates){
            String date_text=ele.getText();

            String date[]=date_text.split("\n");

            if(date[1].equals(ex_date)){
                ele.click();
                break;
            }
        }
    }
}

