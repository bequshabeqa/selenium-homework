package Utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    private  int count = 0;

    private static final int maxRetryCount = 3;

    @Override
    public boolean retry(ITestResult result) {
        if (count < maxRetryCount) {
            count++;
            System.out.println("Retry test " + result.getName() + "for the " + count + " time.");
            return true;
        }
        return false;
    }
}
