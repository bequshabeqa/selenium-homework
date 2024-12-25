package Elements.selenide;

import Utils.selenide.SetUpClass;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SubmitButtonElement extends SetUpClass {

    public void submitButton() {

        SelenideElement submitButton = $x("//*[@id=\"submit\"]");


    }
}
