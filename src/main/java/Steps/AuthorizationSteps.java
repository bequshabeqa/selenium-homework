package Steps;

import Elements.AuthorizationElements;
import org.testng.Assert;

public class AuthorizationSteps extends AuthorizationElements {

    public void setUserName(String username) {

        findElement(userName).sendKeys(username);
    }

    public void setPassword (String password) {

        findElement(passwordInput).sendKeys(password);
    }

    public void clickLogInButton() {
        findElement(logInButton).click();

    }

    public void checkFlashMessageErrorText(String errorText) {
        Assert.assertTrue(findElement(flashMessage).getText().contains(errorText));
    }
}
