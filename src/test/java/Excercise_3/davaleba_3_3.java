package Excercise_3;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.AssertJUnit.assertTrue;

public class davaleba_3_3 {
    @Test
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        WebElement footer = driver.findElement(By.xpath("/html/body/div[1]/footer"));
        WebElement isFooterVisible = driver.findElement(By.xpath("/html/body/div[1]/footer"));

        Assert.assertTrue(isFooterVisible.isEnabled());
        System.out.println("Footer არის ხილული");

        Point footer_place = footer.getLocation();
        System.out.println("Footer არის ბოლოში");

        Thread.sleep(2000);

        driver.quit();
    }
}