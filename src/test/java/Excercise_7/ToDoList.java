package Excercise_7;

import Steps.selenide.ToDoSteps;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class ToDoList {

    ToDoSteps toDoSteps = new ToDoSteps();

    @BeforeMethod
    public static void SetUp() {
        ChromeOptions options = new ChromeOptions();

        Configuration.browser = "chrome";
        Configuration.timeout = 15000;
    }

    @Test
    public void toDoListTest() {

        open("https://webdriveruniversity.com/");

        toDoSteps.clickOnLink();

    }
}
