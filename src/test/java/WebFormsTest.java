import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebFormsTest {
    @Test
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        System.out.println(" " + "DropDownMenu Info");
        driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-1\"]/option[2]")).click();

        WebElement choise = driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-1\"]/option[2]"));
        Assert.assertTrue(choise.isEnabled());
        System.out.println("1. " + choise.getText());


        driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-2\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-2\"]/option[3]")).click();

        WebElement choise1 = driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-2\"]/option[3]"));
        Assert.assertTrue(choise1.isEnabled());
        System.out.println("2. " + choise1.getText());


        driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-3\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-3\"]/option[3]")).click();

        WebElement choise2 = driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-3\"]/option[3]"));
        Assert.assertTrue(choise2.isEnabled());
        String actualValue = choise.getCssValue("Javascript");
        String exceptedValue = choise.getCssValue("Javascript");
        Assert.assertEquals(actualValue, exceptedValue, "ელემენტები ვერ ემთხვევა!");
        System.out.println("3. " + choise2.getText());


        System.out.println(" " + "CheckBox info");
        WebElement Checkbox = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[1]/input"));
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[1]/input")).click();
        Assert.assertTrue(Checkbox.isEnabled());
        System.out.println("option 1: არის მონიშნული");
        WebElement Checkbox1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[2]/input"));
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[2]/input")).click();
        Assert.assertTrue(Checkbox1.isEnabled());
        System.out.println("option 2: არის მონიშნული");
        WebElement Checkbox2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[4]/input"));
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[4]/input")).click();
        Assert.assertTrue(Checkbox2.isEnabled());
        System.out.println("option 4: არის მონიშნული");

        System.out.println(" " + "RadioButton Info");
        WebElement radioButton = driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[3]"));
        WebElement colorValue = driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[3]"));
        driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[3]")).click();
        Assert.assertTrue(radioButton.isEnabled());
        System.out.println(radioButton.getText()); // არ მუშაობს ???
        System.out.println(colorValue.getText());  // არ მუშაობს ???
        System.out.println(colorValue.getAttribute("value"));

        driver.findElement(By.xpath("//*[@id=\"fruit-selects\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"fruit-selects\"]/option[2]")).click();

        WebElement value = driver.findElement(By.xpath("//*[@id=\"fruit-selects\"]/option[2]"));
        Assert.assertFalse(value.isEnabled());
        System.out.println(value.getText() + " disabled" );

        driver.close();
    }
}
