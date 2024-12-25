package Utils.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.time.Duration;

public class SetUpClass_1 {

    protected static WebDriver driver;

    protected static WebDriverWait wait;

    public void setUpGlobalWait() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust timeout if needed

    }

    @BeforeSuite
    public void initializeDriver() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @AfterSuite
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }

    public WebElement findElement(By locator) {

        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }
}
