package selenide;

import Steps.selenide.ScrollSteps;
import Steps.selenide.SubmitButtonSteps;
import Utils.selenide.SetUpClass;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.disabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class Excercise_3_selenide extends SetUpClass {

    SubmitButtonSteps submitButtonSteps = new SubmitButtonSteps();
    ScrollSteps scrollSteps = new ScrollSteps();

    @BeforeMethod
    public static void SetUp() {
        ChromeOptions options = new ChromeOptions();

        Configuration.browser = "chrome";
        Configuration.browserCapabilities = options;
        Configuration.browserSize = null;
        Configuration.holdBrowserOpen = true;
        Configuration.savePageSource = false;
        Configuration.timeout = 15000;
    }

    @Test
    public void Scroll() {

        open("https://the-internet.herokuapp.com/infinite_scroll");



    }

    @Test
    public void Submit() {

        open("https://demoqa.com/text-box");

        submitButtonSteps.submitButton();
        submitButtonSteps.submitButtonOption();


        System.out.println("ღილაკი არის: " + visible + " " + "ღილაკი არის: " + disabled);


    }

    @Test
    public void lastScroll() {

        open("https://www.selenium.dev/");


        $x("/html/body/div[1]/footer").shouldBe(visible);

        $x("/html/body/div[1]/footer").scrollTo();

        $x("/html/body/div[1]/footer").shouldBe(visible);
    }
}
