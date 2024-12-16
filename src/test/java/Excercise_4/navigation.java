package Excercise_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class navigation {
    @Test
    public static void staticTable() throws InterruptedException {
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

                WebDriver driver = new ChromeDriver();

                driver.get("https://the-internet.herokuapp.com/tables");

        WebElement table = driver.findElement(By.id("table1"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));

            for (int i = 1; i < rows.size(); i++) {
                List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
                String name = columns.get(1).getText();
                String balance = columns.get(3).getText();

                System.out.println("სახელი: " + name + " " + "ბალანსი: " + balance);

                if (name.equals("Frank")) {
                    System.out.println("სახელი 'Frank' არსებობს");

            }

                driver.quit();
        }
    }
}
