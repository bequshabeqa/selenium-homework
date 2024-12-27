package Elements.selenide;

import static com.codeborne.selenide.Selenide.$;

public class SelenideElement {

    com.codeborne.selenide.SelenideElement hoverButton = $("button#toolTipButton");

    com.codeborne.selenide.SelenideElement tooltip = $("div.tooltip-inner");

    public void scrollTo() {
    }
}
