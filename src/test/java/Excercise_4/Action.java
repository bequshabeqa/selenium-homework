package Excercise_4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Action {
    @Test
    public static <WebDriverWait> void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        Actions actions = new Actions(driver);

        driver.get("https://demoqa.com/tool-tips");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            WebElement tipBox = driver.findElement(By.id("toolTipButton"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", tipBox);
            actions.moveToElement(tipBox).perform();

            WebElement tipText = driver.findElement(By.className("tooltip-inner"));
            Assert.assertTrue(tipText.isDisplayed());

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.quit();
    }
}
