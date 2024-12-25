package Elements.selenide;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class WebFormsElements {

    public SelenideElement dropDown1 = $(Selectors.byId("dropdowm-menu-1"));

    public SelenideElement dropDown2 = $(Selectors.byId("dropdowm-menu-2"));

    public SelenideElement dropDown3 = $(Selectors.byId("dropdowm-menu-3"));


    public SelenideElement checkBox1 = $(Selectors.byXpath("//*[@id=\"checkboxes\"]/label[1]/input"));

    public SelenideElement checkBox2 = $(Selectors.byXpath("//*[@id=\"checkboxes\"]/label[2]/input"));

    public SelenideElement checkBox3 = $(Selectors.byXpath("//*[@id=\"checkboxes\"]/label[3]/input"));

    public SelenideElement checkBox4 = $(Selectors.byXpath("//*[@id=\"checkboxes\"]/label[4]/input"));


    public SelenideElement radioButton = $(Selectors.byXpath("//*[@id=\"radio-buttons\"]/input[3]"));
}

