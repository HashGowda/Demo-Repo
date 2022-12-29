package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA {
    static WebDriver driver;

    static void launch(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
    }

    static void getHeader(){
        WebElement pageHeader=driver.findElement(By.className("main-header"));
        String header=pageHeader.getText();
        System.out.println("Page Header : "+header);
    }

    static void getDOB(){
        WebElement dob=driver.findElement(By.id("dateOfBirthInput"));
        String DOB=dob.getAttribute("value");
        System.out.println("Date of Birth : "+DOB);

        WebElement textArea= driver.findElement(By.id("currentAddress"));
        System.out.println("Current Address : "+textArea.getAttribute("placeholder"));

        WebElement textArea2=driver.findElement(By.xpath("//*[@id='subjectsContainer']"));
        textArea2.sendKeys("Mathematics");
        System.out.println("Subjects : "+textArea2);
    }

    static void radioButton(){
        WebElement radioBtn1=driver.findElement(By.id("gender-radio-1"));
        WebElement radioBtn2=driver.findElement(By.id("gender-radio-2"));
        WebElement radioBtn3=driver.findElement(By.id("gender-radio-3"));

        radioBtn2.click();
        System.out.println(radioBtn1.isSelected());
        System.out.println(radioBtn2.isSelected());

        System.out.println(driver.findElement(By.xpath("//*[@id='gender-radio-2']")));
    }

    public static void main(String[] args) {
        launch();
        getHeader();
        getDOB();
        radioButton();
    }
}
