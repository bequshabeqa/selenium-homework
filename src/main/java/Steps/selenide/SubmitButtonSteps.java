package Steps.selenide;

import Elements.selenide.SubmitButtonElement;

import static com.codeborne.selenide.Condition.disabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class SubmitButtonSteps extends SubmitButtonElement {


    public void submitButtonOption() {
        submitButton();
    }

    public void checkSubmitButton (String submitButton){

        $x("//*[@id=\"submit\"]").shouldBe(visible);
        $x("//*[@id=\"submit\"]").shouldBe(disabled);
        $x("//*[@id=\"submit\"]").click();
        $x("//*[@id=\"submit\"]").selectOption(submitButton);

    }
}
