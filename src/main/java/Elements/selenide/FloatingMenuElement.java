package Elements.selenide;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FloatingMenuElement {

    public SelenideElement searchFloatingMenu = $(By.linkText("a[href='/floating_menu']"));
}
