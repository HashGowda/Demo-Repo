package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {

    public WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        DropDown dropdown=new DropDown();
        dropdown.launchBrowser();
        dropdown.handleDropDown();
        dropdown.handleBySelectClass();
        dropdown.handleBySelectclass();
        dropdown.text();
    }

    void launchBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
        Thread.sleep(3000);
    }

    void handleDropDown() throws InterruptedException {
        driver.findElement(By.xpath("//*[text()='Select Option']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='Group 1, option 1']")).click();
        Thread.sleep(3000);
    }

    void handleBySelectClass() throws InterruptedException {
        WebElement element=driver.findElement(By.id("oldSelectMenu"));
        Select select=new Select(element);
        select.selectByVisibleText("Black");
        Thread.sleep(3000);
    }

    void handleBySelectclass() throws InterruptedException {
        WebElement cars = driver.findElement(By.xpath("//*[@*='cars']"));
        Select select = new Select(cars);
        select.selectByIndex(2);
        Thread.sleep(3000);
    }

    void text() throws InterruptedException {
        List<WebElement> ele=driver.findElements(By.id("oldSelectMenu"));
        for (int i=0; i<ele.size();i++){
            String list=ele.get(i).getText();
            System.out.println("The list is :\n"+list);
            Thread.sleep(3000);
        }

        List<WebElement> CarList=driver.findElements(By.id("cars"));
        for (int j=0; j<CarList.size();j++){
            String listCars=CarList.get(j).getText();
            System.out.println("\nCars list :\n"+listCars);
            Thread.sleep(3000);
        }
        driver.quit();
    }
}
