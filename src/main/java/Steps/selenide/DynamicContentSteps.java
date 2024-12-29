package Steps.selenide;

import Elements.selenide.DynamicContentElement;

import static com.codeborne.selenide.Selenide.*;

public class DynamicContentSteps extends DynamicContentElement {


    public void clickOnLink(){
        link.click();
    }

    public void dynamicContentRefresh () {

        String[] previousContent = new String[3];

        for (int i = 0; i < 3; i++) {
            String currentContent = $("div[class='row']").getText();
            previousContent[i] = currentContent;

            refresh();
            sleep(2000);

            String newContent = "newContent";
            if (newContent.equals(previousContent[i])) {
                throw new AssertionError("არაფერი არ იცვლება რეფრეშის შედეგად " + (i + 1));
            }
        }
    }
}
