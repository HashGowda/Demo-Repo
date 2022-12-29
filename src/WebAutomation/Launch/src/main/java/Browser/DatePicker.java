package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        String month=" March 2019";
        String day="20";

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HHRA1231\\Downloads\\Apps\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phptravels.net/");

        driver.findElement(By.xpath("//*[@id=\"checkin\"]")).click();
        Thread.sleep(2000);

        while(true){
            String text=driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[8]/div[1]/table/thead/tr[1]/th[2]")).getText();
            System.out.println(text);

            if(text.equals(month)){
                break;
            }
            else {
                driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[8]/div[1]/table/thead/tr[1]/th[1]/i")).click();
            }
        }
        driver.findElement(By.xpath("//div[9]//div[1]//table[1]//tbody[1]//tr//td[contains(text(),"+day+")]")).click();
    }
}
