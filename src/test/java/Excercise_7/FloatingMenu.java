package Excercise_7;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class FloatingMenu {


    @BeforeMethod
    public static void SetUp() {
        ChromeOptions options = new ChromeOptions();

        Configuration.browser = "chrome";
        Configuration.timeout = 15000;
    }

    @Test
    public void floatingMenu() {

        open("https://the-internet.herokuapp.com/");

        executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
        sleep(2000);

        executeJavaScript("window.scrollTo(0, 0);");
        sleep(2000);


    }
}
