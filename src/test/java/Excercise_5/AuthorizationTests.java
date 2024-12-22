package Excercise_5;

import Data.selenium.userNameData;
import Steps.selenium.AuthorizationSteps;
import Utils.selenium.SetUpClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AuthorizationTests extends SetUpClass {

    userNameData userNameData = new userNameData();

    AuthorizationSteps authorizationSteps = new AuthorizationSteps();

    @BeforeSuite
    public void suit() {
        setUpGlobalWait();
    }

    @Test
    public void LogInSuccessTest() {
        driver.get("https://the-internet.herokuapp.com/login");

        authorizationSteps.setUserName(userNameData.validUserName);
        authorizationSteps.setPassword(userNameData.validPassword);
        authorizationSteps.clickLogInButton();

        authorizationSteps.checkFlashMessageErrorText("Your username is invalid!");
    }

    @Test
    public void LogInSuccessTest2() {
        driver.get("https://the-internet.herokuapp.com/login");

        authorizationSteps.setUserName(userNameData.validUserName);
        authorizationSteps.setPassword(userNameData.validPassword);
        authorizationSteps.clickLogInButton();

        authorizationSteps.checkFlashMessageErrorText("Your username is Blocked!");

    }
}