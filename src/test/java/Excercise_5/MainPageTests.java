package Excercise_5;

import Data.userNameData;
import Steps.AuthorizationSteps;
import Utils.SetUpClass;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPageTests extends SetUpClass {

    Data.userNameData userNameData = new userNameData();
    AuthorizationSteps authorizationSteps = new AuthorizationSteps();

    @BeforeMethod
    public void login() {
        driver.get("https://the-internet.herokuapp.com/login");
        authorizationSteps.setUserName(userNameData.validUserName);
        authorizationSteps.setPassword(userNameData.validPassword);
        authorizationSteps.clickLogInButton();
    }

    @Test
    public void checkMainPage() {
        Assert.assertTrue(false);
    }
    @Test
    public void checkMainPage2() {
        Assert.assertTrue(false);
    }
    @Test
    public void checkMainPage3() {
        Assert.assertTrue(false);
    }
}
