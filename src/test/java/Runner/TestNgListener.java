package Runner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("On Test Start");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("On Test Success");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("On Test Failure");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("On Test Skip");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("On within success percent");
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("On Test Time out");
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("On  start");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("On finish");
    }
}
