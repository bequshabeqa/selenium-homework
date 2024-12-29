package Elements.selenide;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DynamicContentElement {

    public SelenideElement link = $(By.linkText("Dynamic Content"));
}
