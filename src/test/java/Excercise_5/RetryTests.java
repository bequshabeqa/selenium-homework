package Excercise_5;

import Utils.RetryAnalyzer;
import Utils.SetUpClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTests {

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void testMethod() {

        double ran = Math.random();
        System.out.println(ran);
        System.out.println("Running the test method");
        Assert.assertTrue(ran< 0.5);
    }

}
