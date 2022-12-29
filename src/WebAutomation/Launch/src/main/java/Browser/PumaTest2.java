package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.bouncycastle.jcajce.provider.drbg.DRBG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PumaTest2 {

        static WebDriver driver;

        static void launch() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\HHRA1231\\Downloads\\Apps\\chromedriver.exe");
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://in.puma.com/in/en");
            Thread.sleep(2000);
        }

        static void search() throws InterruptedException {
            //WebElement Search=driver.findElement(By.xpath("//*[@type='search']"));
            //Search.sendKeys("MENS SHOES");
            //driver.findElement(By.xpath("//*[@*='text-3xl w-[1em] h-[1em] text-white fill-current']")).click();
            driver.findElement(By.xpath("//*[@type='search']")).sendKeys("MENS SHOES");
            Thread.sleep(2000);

            List<WebElement> suggList=driver.findElements(By.xpath("//*[@*='text-base font-bold leading-tight']"));

            for(WebElement e:suggList){
                System.out.println(e.getText());
            }
        }

//        static void details() throws InterruptedException {
//            driver.findElement(By.linkText("Trigger Unisex Shoes")).click();
//            Thread.sleep(2000);
//        }

        public static void main(String[] args) throws InterruptedException {
            launch();
            search();
            //details();
        }
    }

