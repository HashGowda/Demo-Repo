package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class NewTab {

    public WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        NewTab newTab=new NewTab();
        newTab.launchBrowser();
        newTab.handleTab();
        newTab.handleWindow();
        newTab.windowMessage();
    }

    void launchBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");
        Thread.sleep(3000);
    }

    void handleTab() throws InterruptedException {
        driver.findElement(By.xpath("//*[text()='New Tab']")).click();
        Thread.sleep(3000);

        String mainTab=driver.getWindowHandle();

        Set<String> s1=driver.getWindowHandles();
        Iterator<String> i1=s1.iterator();

        while (i1.hasNext()){
            String childTab=i1.next();

            if(!mainTab.equalsIgnoreCase(childTab)){
                driver.switchTo().window(childTab);
                Thread.sleep(3000);
                String text=driver.findElement(By.id("sampleHeading")).getText();
                System.out.println("New tab text: "+text);
                Thread.sleep(3000);
                driver.close();
            }
        }
        driver.switchTo().window(mainTab);
        Thread.sleep(3000);
    }

    void handleWindow() throws InterruptedException {
        driver.findElement(By.xpath("//*[text()='New Window']")).click();
        driver.manage().window().maximize();
        Thread.sleep(3000);

        String mainWindow=driver.getWindowHandle();

        Set<String> s2=driver.getWindowHandles();
        Iterator<String> i2=s2.iterator();

        while (i2.hasNext()){
            String childWindow= i2.next();

            if(!mainWindow.equalsIgnoreCase(childWindow)){
                driver.switchTo().window(childWindow);
                Thread.sleep(3000);
                String text2= driver.findElement(By.id("sampleHeading")).getText();
                System.out.println("Text in ChildWindow: "+text2);
                Thread.sleep(3000);
                driver.close();
            }
        }
        driver.switchTo().window(mainWindow);
        Thread.sleep(3000);
    }

    void windowMessage() throws InterruptedException {
        driver.findElement(By.xpath("//*[@*='messageWindowButton']")).click();
        Thread.sleep(3000);

        String popUp=driver.getWindowHandle();
        Set<String> s3=driver.getWindowHandles();
        Iterator<String> i3= s3.iterator();

        while (i3.hasNext()){
            String popMessage= i3.next();

            if(!popUp.equalsIgnoreCase(popMessage)){
                driver.switchTo().window(popMessage);
                Thread.sleep(3000);
                driver.close();
            }
        }
        driver.switchTo().window(popUp);
        Thread.sleep(3000);
        driver.quit();
    }
}
