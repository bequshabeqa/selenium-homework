import Steps.selenium.AuthorizationSteps;
import Utils.selenium.SetUpClass;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class webformsinslelenidepom extends SetUpClass {

    WebFormsTest webFormsTest = new WebFormsTest();

    AuthorizationSteps authorizationSteps = new AuthorizationSteps();

    @BeforeMethod
    public void setWebFormsTest(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        Configuration.browser = "chrome";
        Configuration.browserCapabilities = options;
        Configuration.browserSize = null;
        Configuration.holdBrowserOpen = true;
        Configuration.savePageSource = false;
        Configuration.timeout = 15000;

    }



    @Test
    public void Progress() {

        open("https://demoqa.com/progress-bar");

        $("#startStopButton").click();

        $("#progressBar").shouldHave(Condition.text("100%"));

    }

    @Test
    public void WebForms() {

        open("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        $("#dropdowm-menu-1").selectOption("Python");

        $("#dropdown-menu-1").shouldHave(Condition.text("Python"));

        $$("input[type=checkbox]").forEach(el -> {
            if (!el.isSelected()) {
                el.click();
            }
        });

        $$("#radio-buttons input").filterBy(attribute("value", "yellow"));

        $("#radio-buttons input[value='yellow;]").shouldBe(checked);
        $("#select-disabled").selectOption("Orange");
        $("#select-disabled").getSelectedOption().shouldBe(disabled);
    }
}