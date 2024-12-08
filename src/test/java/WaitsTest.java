import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class WaitsTest {
    @Test
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/progress-bar");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//        driver.findElement(By.xpath("//*[@id=\"startStopButton\"]")).click();
//        WebElement message = driver.findElement(By.xpath("//*[@id=\"progressBar\"]/div"));
//        System.out.println("შედეგი: " + message.getText() + " 100%");

//        WebElement start = (WebElement) By.xpath("//*[@id=\"startStopButton\"]");
//        Assert.assertTrue(start.isEnabled());
        driver.findElement(By.xpath("//*[@id=\"startStopButton\"]")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        WebElement reset = driver.findElement(By.xpath("//*[@id=\"resetButton\"]"));
        Assert.assertTrue(reset.isEnabled());
//        WebElement style = driver.findElement(By.name("width"));
//        System.out.println("შედეგი: " + style.getText());
        System.out.println("100%");
        Thread.sleep(3000);


        driver.close();
    }
}