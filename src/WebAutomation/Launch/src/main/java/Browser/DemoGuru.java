package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.jcajce.provider.drbg.DRBG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGuru {

    public static void main(String[] args) throws InterruptedException {

        //declaration and instantiation of objects/variables

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/radio.html");

        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
        WebElement radio3 = driver.findElement(By.id("vfb-7-3"));

        //Radio Button1 is selected

        radio1.click();
        System.out.println("Radio button 1 i selected");
        Thread.sleep(2000);

        //Radio Button2 is selected

        radio2.click();
        System.out.println("Radio button 2 i selected");
        Thread.sleep(2000);

        //Radio Button3 is selected

        radio3.click();
        System.out.println("Radio button 3 i selected");
        Thread.sleep(2000);

//Selecting CheckBox

        WebElement option1 = driver.findElement(By.id("vfb-6-0"));
        WebElement option2 = driver.findElement(By.id("vfb-6-1"));
        WebElement option3 = driver.findElement(By.id("vfb-6-2"));

//This will Toggle the Check box

        option2.click();
        System.out.println("Toggle2 is ON");
        Thread.sleep(2000);



//Check whether the Check box is toggled on

        if (option2.isSelected()) {
            System.out.println("Checkbox toggle is On");
        } else {
            System.out.println("Checkbox toggle is Off");
        }

        driver.quit();
    }
}
