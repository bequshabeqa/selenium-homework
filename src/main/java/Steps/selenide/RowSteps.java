package Steps.selenide;

import Elements.selenide.RowElement;

import static com.codeborne.selenide.Selenide.$;

public class RowSteps extends RowElement {

    public void RowUserName (String name) {

        $("td:nth-child(1)").getText();

        $("td:nth-child(3)").getText();

    }
}
