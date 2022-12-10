package main.Util;

import org.testng.*;
import org.testng.xml.XmlSuite;

import java.util.List;
import java.util.Map;

public class TestNGListeners implements ITestListener , IReporter ,ISuiteListener ,IInvokedMethodListener ,IExecutionListener{

    @Override
    public void onExecutionStart() {
        System.out.println("Execution is starting");

    }

    @Override
    public void onExecutionFinish() {
        System.out.println("Execution is finished");
    }


    public void onStart(ISuite suite) {
        System.out.println("onStart function started "  + suite.getName());
    }
    public void onFinish(ISuite suite) {
        System.out.println("onFinish function started "  + suite.getName());
    }

    public void onStart(ITestContext context) {
        System.out.println("onStart method started");
    }

    public void onFinish(ITestContext context) {
        System.out.println("onFinish method started");
    }

    public void onTestStart(ITestResult result) {
        System.out.println("New Test Started" + result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess Method" + result.getName());
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure Method" + result.getName());
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped Method" + result.getName());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("onTestFailedButWithinSuccessPercentage" + result.getName());
    }


    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites,
                               String outputDirectory) {

        //Iterate over every suite assigned for execution
        for (ISuite suite : suites) {

            String suiteName = suite.getName();
            Map<String, ISuiteResult> suiteResults = suite.getResults();
            for (ISuiteResult sr : suiteResults.values()) {
                ITestContext tc = sr.getTestContext();
                System.out.println("Passed tests for suite '" + suiteName +
                        "' is:" + tc.getPassedTests().getAllResults().size());
                System.out.println("Failed tests for suite '" + suiteName +
                        "' is:" + tc.getFailedTests().getAllResults().size());
                System.out.println("Skipped tests for suite '" + suiteName +
                        "' is:" + tc.getSkippedTests().getAllResults().size());
            }
        }
    }
}
