package Elements;

import Utils.SetUpClass;
import org.openqa.selenium.By;

public class AuthorizationElements extends SetUpClass {

    public By userName = By.id("username");

    public By passwordInput = By.id("username");

    public By logInButton = By.xpath("//button[@type='submit']");

    public By flashMessage = By.id("flash");

}
