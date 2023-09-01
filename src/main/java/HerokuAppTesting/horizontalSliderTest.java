package HerokuAppTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class horizontalSliderTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Z:\\Projects\\SeleniumBasics\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[normalize-space()='Horizontal Slider']")).click();

        Actions actions = new Actions(driver);
        WebElement slider = driver.findElement(By.xpath("//input[@value='0']"));
        Thread.sleep(2000);
        actions.dragAndDropBy(slider, 50,0).perform();
        Thread.sleep(1000);
        actions.dragAndDropBy(slider, -10,0).perform();
        Thread.sleep(1000);
        actions.dragAndDropBy(slider, 20,0).perform();
        Thread.sleep(3000);
        driver.quit();

    }
}
