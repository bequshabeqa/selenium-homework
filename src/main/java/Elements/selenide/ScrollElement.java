package Elements.selenide;

import Utils.selenide.SetUpClass;
import com.codeborne.selenide.Selenide;

public class ScrollElement extends SetUpClass {

    public SelenideElement scroll1 = Selenide.executeJavaScript("window.scrollBy(0, 500);");

    public SelenideElement scroll2 = Selenide.executeJavaScript("window.scrollBy(0, 1000);");

    public SelenideElement scroll3 = Selenide.executeJavaScript("window.scrollBy(0, 1500);");
}