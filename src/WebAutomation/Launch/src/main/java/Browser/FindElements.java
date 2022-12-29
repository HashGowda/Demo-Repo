package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.SortedMap;

public class FindElements {
    public WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        FindElements getTextAndGetAttribute=new FindElements();
        getTextAndGetAttribute.launchBrowser();
        getTextAndGetAttribute.login();
        getTextAndGetAttribute.navigateToMyInfo();
    }

    void launchBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    void login() throws InterruptedException {
        Thread.sleep(3000);
        WebElement userName=driver.findElement(By.xpath("//*[@*='username']"));
        userName.sendKeys("Admin");
        WebElement password=driver.findElement(By.xpath("//*[@*='password']"));
        password.sendKeys("admin123");
        WebElement loginButton=driver.findElement(By.xpath("//button[contains(@class, 'oxd-button')]"));
        loginButton.click();
    }

    void navigateToMyInfo() throws InterruptedException {
        Thread.sleep(5000);
        WebElement myInfo=driver.findElement(By.xpath("//span[text()='My Info']"));

        myInfo.click();
        Thread.sleep(3000);
        WebElement ssnNo=driver.findElement(By.xpath("//label[text()='SSN Number']"));
        String ssnText= ssnNo.getText();
        System.out.println("Text from getText : "+ssnText);

        List <WebElement> menuOption=driver.findElements(By.xpath("//*[@class='oxd-text oxd-text--span oxd-main-menu-item--name']"));
        for(int i=0; i<menuOption.size();i++){
            String textValue=menuOption.get(i).getText();
            System.out.println(textValue);
        }
    }
}
