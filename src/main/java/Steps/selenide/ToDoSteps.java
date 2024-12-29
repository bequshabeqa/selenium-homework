package Steps.selenide;

import Elements.selenide.ToDoElements;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class ToDoSteps extends ToDoElements {

        public void clickOnLink(){

//            $(Selectors.byText("TO DO LIST")).scrollTo();
//            sleep(2000); ar imushava ???

            link.click();
        }

        public void ListTest() {
            String[] tasks = {"Excercise 1", "Excercise 2", "Excercise 3"};
            for (String task : tasks) {
                $("#add-todo").setValue(task).pressEnter();
            }

            for (String task : tasks) {
                $("ul#todo-list").shouldHave(text(task));
            }

            $("ul#todo-list li:nth-child(2) .delete").click();

            $("ul#todo-list li:nth-child(1)").shouldHave(text("Task 1"));
            $("ul#todo-list li:nth-child(2)").shouldHave(text("Task 3"));

            $("ul#todo-list").shouldNotHave(text("Task 2"));

            sleep(2000);
        }
}
