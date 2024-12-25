package Elements.selenide;

import Utils.selenide.SetUpClass;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class ScrollElement extends SetUpClass {

    public void Scroll() {

        SelenideElement scroll1 =  Selenide.executeJavaScript("window.scrollTo(0, 500);");

        SelenideElement scroll2 =  Selenide.executeJavaScript("window.scrollTo(0, 1000);");

        SelenideElement scroll3 =  Selenide.executeJavaScript("window.scrollTo(0, 1500);");
    }
}
