package Excercise_7;

import Steps.selenide.DataTableSteps;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class DataTableTest {

    DataTableSteps dataTableSteps = new DataTableSteps();

    @BeforeMethod
    public static void SetUp() {
        ChromeOptions options = new ChromeOptions();

        Configuration.browser = "chrome";
        Configuration.timeout = 15000;
    }

    @Test
    public void dataTableTest() {

        open("https://the-internet.herokuapp.com/");

        dataTableSteps.clickOnLink();
    }
}
