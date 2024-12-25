package selenide;

import Steps.selenide.WebFormsSteps;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class WebFormsTestSelenide {

    WebFormsSteps webFormsSteps = new WebFormsSteps();

    @Test
    public void webFormsTest() {
        open("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        webFormsSteps.selectOptions1("SQL");
        webFormsSteps.checkSelectionOption1("SQL");

        webFormsSteps.selectOptions2("Maven");
        webFormsSteps.checkSelectionOption2("Maven");

        webFormsSteps.selectOptions3("CSS");
        webFormsSteps.checkSelectionOption3("CSS");


        webFormsSteps.checkBox1.click();
        webFormsSteps.checkBox2.click();
        webFormsSteps.checkBox3.click();
        webFormsSteps.checkBox4.click();

        webFormsSteps.radioButton.click();
    }

}
