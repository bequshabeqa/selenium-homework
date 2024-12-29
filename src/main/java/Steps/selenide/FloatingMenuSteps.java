package Steps.selenide;

import Elements.selenide.FloatingMenuElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.sleep;

public class FloatingMenuSteps extends FloatingMenuElement {

    public void scroll() {

        searchFloatingMenu.click();

        executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
        sleep(2000);

        searchFloatingMenu.shouldBe(visible);

        executeJavaScript("window.scrollTo(0, 0);");
        sleep(2000);

        searchFloatingMenu.shouldBe(visible);

    }
}
