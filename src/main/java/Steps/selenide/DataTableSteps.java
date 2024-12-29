package Steps.selenide;

import Elements.selenide.DataTableElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DataTableSteps extends DataTableElement {

    public void clickOnLink(){
        link.click();
    }

    public void checkEmail() {

        String lastName = "Doe";
        String email = "jdoe@hotmail.com";

        String emailFound = $$("table#table2 tbody tr").find(text(lastName)).$("td:nth-child(3)").getText();

        if (!emailFound.equals(email)) {
            throw new AssertionError("Email does not match for last name " + lastName + ". Found: " + emailFound);
        }

        $("table#table2 thead th:nth-child(1)").click();

        String firstName = $("table#table2 tbody tr:first-child td:nth-child(1)").getText();
        String lastNameFirstEntry = $("table#table2 tbody tr:first-child td:nth-child(2)").getText();

        if (!firstName.equals("John") || !lastNameFirstEntry.equals("Doe")) {
            throw new AssertionError("First entry does not match. Found: " + firstName + " " + lastNameFirstEntry);
        }

        sleep(2000);
        closeWebDriver();
    }
}
