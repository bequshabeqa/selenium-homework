package Elements.selenide;

import Utils.selenide.SetUpClass;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;

public class ScrollElement extends SetUpClass {

    public SelenideElement scroll1 = $(Selectors.window.scrollTo(0, 500));

    public SelenideElement scroll2 = Selenide.executeJavaScript("window.scrollTo(0, 1000);");

    public SelenideElement scroll3 = Selenide.executeJavaScript("window.scrollTo(0, 1500);");
}