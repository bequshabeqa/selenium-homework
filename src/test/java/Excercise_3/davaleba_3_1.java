package Excercise_3;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class davaleba_3_1 {
    @Test
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/infinite_scroll");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        long position1 = (Long) ((JavascriptExecutor) driver).executeScript("return window.pageYOffset");
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Thread.sleep(2000);
        long newPosition1 = (Long) ((JavascriptExecutor) driver).executeScript("return window.pageYOffset");
        Assert.assertFalse(newPosition1 > position1, "Scroll-მა არ იმუშავა სწორად!");

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Thread.sleep(2000);
        long newPosition2 = (Long) ((JavascriptExecutor) driver).executeScript("return window.pageYOffset");
        Assert.assertFalse(newPosition2 > newPosition1, "მეორე Scroll-მა არ იმუშავა სწორად!");

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Thread.sleep(2000);
        long newPosition3 = (Long) ((JavascriptExecutor) driver).executeScript("return window.pageYOffset");
        Assert.assertFalse(newPosition3 > newPosition2, "მესამე Scroll-მა არ იმუშავა სწორად!");


        driver.close();
    }
}