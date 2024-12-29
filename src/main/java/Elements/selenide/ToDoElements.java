package Elements.selenide;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ToDoElements {

    public SelenideElement link = $(Selectors.byText("TO DO LIST"));


    public SelenideElement addExcercises = $("#add-todo");
 }
