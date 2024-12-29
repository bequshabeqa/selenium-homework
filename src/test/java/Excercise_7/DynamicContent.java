package Excercise_7;

import Steps.selenide.DynamicContentSteps;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class DynamicContent {

    DynamicContentSteps dynamicContentSteps = new DynamicContentSteps();


    @BeforeMethod
    public static void SetUp() {
        ChromeOptions options = new ChromeOptions();

        Configuration.browser = "chrome";
        Configuration.timeout = 15000;
    }

    @Test
    public void dynamicContentTest() {

        open("https://the-internet.herokuapp.com/");

        dynamicContentSteps.clickOnLink();
        dynamicContentSteps.dynamicContentRefresh();
    }
}
