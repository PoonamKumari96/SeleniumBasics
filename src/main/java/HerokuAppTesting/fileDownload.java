package HerokuAppTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileDownload {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Z:\\Projects\\SeleniumBasics\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[normalize-space()='File Download']")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("icon.png")).click();
        Thread.sleep(3000);
        driver.quit();



    }
}
