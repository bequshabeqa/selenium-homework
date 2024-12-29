package Elements.selenide;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DataTableElement {

    public SelenideElement link = $(Selectors.byText("Sortable Data Tables"));

}
