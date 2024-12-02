import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class WaitsTest {
    @Test
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/progress-bar");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//*[@id=\"startStopButton\"]")).click();
        WebElement message = driver.findElement(By.xpath("//*[@id=\"progressBar\"]/div"));
        System.out.println("შედეგი: " + message.getText() + " 100%");

    }
}
