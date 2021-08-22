import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
    private static ExtentReports extent = ExtentManager.createInstance();
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
    public void onStart(ITestContext context) {
        System.out.println("onStart method started");
    }

    public void onFinish(ITestContext context) {
        System.out.println("onFinish method started");
        extent.flush();
    }

    public void onTestStart(ITestResult result) {
        System.out.println("New Test Started" +result.getName());
        ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName(),result.getMethod().getDescription());
        test.set(extentTest);
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess Method" +result.getName());
        test.get().pass("Test passed");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure Method" +result.getName());
       // test.get().fail(result.getThrowable());
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped Method" +result.getName());
        //test.get().skip(result.getThrowable());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("onTestFailedButWithinSuccessPercentage" +result.getName());
    }
}