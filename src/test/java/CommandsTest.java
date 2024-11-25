import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class CommandsTest {
    @Test
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
//        WebElement enableButton = driver.findElement(By.xpath("//*[@id="input-example"]/button")).click();
        WebElement enableButton = driver.findElement(By.xpath("//button[text()='Enable']"));
        enableButton.click();

        WebElement message = driver.findElement(By.id("message"));
        System.out.println("Enable შეტყობინება: " + message.getText());
        System.out.println("Disable შეტყობინება: " + enableButton.getText());

        WebElement inputType = driver.findElement(By.xpath("//*[@id=\"input-example\"]/input"));

        inputType.sendKeys("Bootcamp");
        System.out.println("ტექსტი: Bootcamp");
        inputType.clear();
        System.out.println("სახელის ველი ცარიელია.");


        driver.get("http://the-internet.herokuapp.com/drag_and_drop");

        WebElement A = driver.findElement(By.xpath("//*[@id=\"column-a\"]"));
        WebElement B = driver.findElement(By.xpath("//*[@id=\"column-b\"]"));

        System.out.println(driver.findElement(By.xpath("//*[@id=\"column-a\"]")).getLocation().y);
        System.out.println(driver.findElement(By.xpath("//*[@id=\"column-b\"]")).getLocation().y);



        driver.close();
    }
}