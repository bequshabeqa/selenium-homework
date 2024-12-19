package Excercise_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class Robot_class {
    @Test
    public static void main(String[] args) throws AWTException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        Robot robot = new Robot();

        driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Selenium Robot Class example");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        robot.keyPress(KeyEvent.VK_ENTER);


        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        driver.quit();
    }
}
