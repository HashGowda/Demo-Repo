package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RadioBtn2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HHRA1231\\Downloads\\Apps\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        /*
        driver.get("https://demo.guru99.com/test/radio.html");

        int a = driver.findElements(By.xpath("//*[@name='webform']")).size();
        System.out.println("Length : " + a);

        for (int i = 0; i < a; i++) {
            driver.findElements(By.xpath("//*[@name='webform']")).get(2).click();

         */


        driver.get("https://demoqa.com/automation-practice-form");

        int a=driver.findElements(By.xpath("//*[@class='custom-control-input']")).size();
        System.out.println("Length : "+a);

        for(int i=0; i<a;i++){
            driver.findElements(By.xpath("//*[@class='custom-control-input']")).get(2).click();
        }
    }
}



