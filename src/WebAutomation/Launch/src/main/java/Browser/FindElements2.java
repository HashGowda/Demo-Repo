package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements2 {

    public WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        FindElements2 getTextAndAttribute=new FindElements2();
        getTextAndAttribute.launchBrowser();
        getTextAndAttribute.login();
        getTextAndAttribute.navigateToMyInfo();
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
        WebElement loginButton=driver.findElement(By.xpath("//button[contains(@class,'oxd-button')]"));
        loginButton.click();
    }

    void navigateToMyInfo() throws InterruptedException {
        Thread.sleep(3000);
        WebElement myInfo=driver.findElement(By.xpath("//span[text()='My Info']"));
        myInfo.click();

        Thread.sleep(3000);
        WebElement nationality=driver.findElement(By.xpath("//label[text()='Nationality']"));
        String text1=nationality.getText();
        System.out.println("Text from getText : "+text1);

        List<WebElement> menuOption=driver.findElements(By.xpath("//*[@class='oxd-text oxd-text--span oxd-main-menu-item--name']"));
        for (int i=0; i<menuOption.size();i++){
            String text2=menuOption.get(i).getText();
            System.out.println(text2);
        }
    }
}
