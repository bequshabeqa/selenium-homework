import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebFormsTest {
    @Test
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-1\"]/option[2]")).click();

        driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-2\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-2\"]/option[3]")).click();

        driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-3\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-3\"]/option[3]")).click();

        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[1]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[2]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[4]/input")).click();

        driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[3]")).click();

        driver.findElement(By.xpath("//*[@id=\"fruit-selects\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"fruit-selects\"]/option[2]")).click();

        WebElement value = driver.findElement(By.xpath("//*[@id=\"fruit-selects\"]/option[2]"));
        System.out.println(value.getText() + " disabled" );

        driver.close();
    }
}
