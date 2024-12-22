package selenide;

import Utils.selenide.SetUpClass;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.module.Configuration;

import static com.codeborne.selenide.Selenide.*;

public class excercise_4 extends SetUpClass {

    private String name;
    private String balance;

    @BeforeMethod
    public static void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

//        Configuration.browser = "chrome";
//        Configuration.browserCapabilities = options;
//        Configuration.browserSize = null;
//        Configuration.holdBrowserOpen = true;
//        Configuration.savePageSource = false;
//        Configuration.timeout = 15000;
    }

    @Test
    public void WebTablesTest() {

        open( "https://the-internet.herokuapp.com/tables");

        $("table#table1 tbody tr");

        $("td:nth-child(1)").getText();

        $("td:nth-child(3)").getText();

        System.out.println("Name: " + name + ", Balance: " + balance);

    }

    @Test
    public void ActionTest() {

        open("https://demoqa.com/tool-tips");

        $("button#toolTipButton").hover();

        $("div.tooltip-inner");

    }

    @Test
    public void RobotClass() {

        open("https://www.google.com");

        $x("//*[@id=\"APjFqb\"]").setValue("Selenium Robot Class example").pressEnter();

        $x("//*[@id=\"APjFqb\"]").sendKeys(Keys.TAB);

        $x("//*[@id=\"APjFqb\"]").sendKeys(Keys.ENTER);
    }
}
