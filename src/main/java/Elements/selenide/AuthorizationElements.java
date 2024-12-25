package Elements.selenide;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class AuthorizationElements {

    public SelenideElement searchInput = $(By.id("username"));

    public SelenideElement searchInput2 = $(By.xpath("//*[text()='test']"));

    public SelenideElement searchInput3 = $(withText("text"));

    public SelenideElement searchInput4 = $(byXpath(""));

    public SelenideElement searchInput14 = $x((""));

    public SelenideElement searchInput5 = $(byAttribute("atr", "val"));

    public SelenideElement searchInput6 = $("div.container").$("button");

    public ElementsCollection els = $$("div").filterBy(text("123"));

    public ElementsCollection els2 = $$("div").excludeWith(text("123"));

    }