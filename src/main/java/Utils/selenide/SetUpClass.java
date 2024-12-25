package Utils.selenide;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.AfterMethod;

import static Utils.selenium.SetUpClass.driver;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SetUpClass {

    public static void setUp() {


        open("");

        SelenideElement hoverButton = $("button#toolTipButton");


    }
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    public void closeWebDriver() {
        Selenide.closeWebDriver();
    }
}