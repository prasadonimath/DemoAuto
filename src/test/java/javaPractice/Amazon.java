package javaPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import java.util.Iterator;
import java.util.Set;

public class Amazon {

    public static void main(String[] args) {

        WebDriver driver =new ChromeDriver();
        WebDriverManager.chromedriver().setup();

        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");

        driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Fire TV')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Fire TV Apps & Games')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Books & Comics')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Spiritual Truth')]")).click();
        Set<String> windoHandles = driver.getWindowHandles();
        Iterator it=windoHandles.iterator();
        if (it.hasNext()){
            driver.switchTo().window(it.next().toString());
            System.out.println(driver.getTitle());
        }



    }
}
