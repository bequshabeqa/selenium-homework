package Data.selenium;

import static com.codeborne.selenide.Selenide.$;

public class RowData {

    public String name = $("td:nth-child(1)").getText();

    public String balance = $("td:nth-child(3)").getText();
}
