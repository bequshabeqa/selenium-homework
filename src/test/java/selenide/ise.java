package selenide;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ise {

    public static class SetUpClass {

        public static WebDriver driver;

        public static WebDriverWait globalWait;


        public static void setup() {

            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            options.addArguments("--window-size=1920,1080");
            options.addArguments("--incognito");
            options.addArguments(
                    "--disable-popup-blocking",
                    "--disable-extensions",
                    "--disable-notifications",
                    "--start-maximized"
            );

            options.setAcceptInsecureCerts(true);

        }

        public static void setUpGlobalWait() {

            globalWait = new WebDriverWait(driver, Duration.ofSeconds(50)); // Global wait duration

        }

        public static WebElement findElement(By element) {

            return globalWait.until(ExpectedConditions.visibilityOfElementLocated(element));

        }

        @AfterMethod
        public void tearDown() {

            if (driver != null) {
                driver.quit();
            }
        }
        @BeforeMethod
        public void beforeTest(){
            setup();
            System.out.println("test passed");
        }
    }
}