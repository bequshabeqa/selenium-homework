package Elements.selenide;

import org.openqa.selenium.Alert;

import static com.codeborne.selenide.Selenide.$;

public class SelenideElement {

    com.codeborne.selenide.SelenideElement hoverButton = $("button#toolTipButton");

    com.codeborne.selenide.SelenideElement tooltip = $("div.tooltip-inner");

}
