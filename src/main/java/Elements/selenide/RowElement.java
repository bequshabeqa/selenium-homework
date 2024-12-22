package Elements.selenide;

import Data.selenium.RowData;
import Utils.selenium.SetUpClass;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$$;

public class RowElement extends SetUpClass {


    public ElementsCollection getTableRows() {
        return $$("table#table1 tbody tr");
    }

    public String getNameFromRow(SelenideElement row) {
        return row.$("td:nth-child(1)").getText();

    }
    public String getBalanceFromRow(SelenideElement row) {
        return row.$("td:nth-child(3)").getText();
    }
}
