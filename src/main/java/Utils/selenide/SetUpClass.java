package Utils.selenide;

import com.codeborne.selenide.SelenideElement;

import java.lang.module.Configuration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SetUpClass {

    public static void setUp() {


        open("");


        SelenideElement hoverButton = $("button#toolTipButton");

    }
}
