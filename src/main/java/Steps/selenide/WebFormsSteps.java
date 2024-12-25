package Steps.selenide;

import Elements.selenide.WebFormsElements;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Condition.disabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class WebFormsSteps extends WebFormsElements {

    public void selectOptions1(String option1){
        dropDown1.selectOption(option1);
    }

    public void selectOptions2(String option2){
        dropDown2.selectOption(option2);
    }

    public void selectOptions3(String option3){
        dropDown3.selectOption(option3);
    }
    public void checkSelectionOption1(String option1) {
        dropDown1.getSelectedOption().shouldHave(Condition.text(option1));
    }
    public void checkSelectionOption2(String option2) {
        dropDown2.getSelectedOption().shouldHave(Condition.text(option2));
    }
    public void checkSelectionOption3(String option3) {
        dropDown3.getSelectedOption().shouldHave(Condition.text(option3));
    }

    public void checkBoxOption1(String option1) {
        $x("//*[@id=\"checkboxes\"]/label[1]/input").shouldBe(visible);
        $x("//*[@id=\"checkboxes\"]/label[1]/input").shouldBe(disabled);
        checkBox1.click();
        checkBox1.selectOption(option1);

    }
    public void checkBoxOption2(String option2) {
        $x("//*[@id=\"checkboxes\"]/label[2]/input").shouldBe(visible);
        $x("//*[@id=\"checkboxes\"]/label[2]/input").shouldBe(disabled);
        checkBox1.click();
        checkBox1.selectOption(option2);
    }
    public void checkBoxOption3(String option3) {
        $x("//*[@id=\"checkboxes\"]/label[3]/input").shouldBe(visible);
        $x("//*[@id=\"checkboxes\"]/label[3]/input").shouldBe(disabled);
        checkBox1.click();
        checkBox1.selectOption(option3);
    }
    public void checkBoxOption4(String option4) {
        $x("//*[@id=\"checkboxes\"]/label[4]/input").shouldBe(visible);
        $x("//*[@id=\"checkboxes\"]/label[4]/input").shouldBe(disabled);
        checkBox1.click();
        checkBox1.selectOption(option4);
    }

    public void radioClick(String option3) {
        $x("//*[@id=\"radio-buttons\"]/input[3]").shouldBe(visible);
        $x("//*[@id=\"radio-buttons\"]/input[3]").shouldBe(disabled);
        radioButton.click();
        radioButton.selectOption(option3);

    }

}
