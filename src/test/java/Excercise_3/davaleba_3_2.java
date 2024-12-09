package Excercise_3;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.AssertJUnit.assertTrue;

public class davaleba_3_2 {
    @Test
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("arguments[0].scrollIntoView(true);", submit);
        Thread.sleep(2000);

        Assert.assertTrue(submit.isEnabled());
        Point footer_place = submit.getLocation();
        Thread.sleep(2000);
        System.out.println("Submit არის ხილული და ის არის აქტიური");
        Thread.sleep(2000);

        driver.quit();

    }
}