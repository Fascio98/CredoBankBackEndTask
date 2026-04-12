package Utils;

import org.testng.ITestResult;

public class TestResultProcessor {
    
    /**
     * Get the status string from ITestResult
     * @param result The TestNG test result
     * @return Status as string (PASSED, FAILED, SKIPPED, UNKNOWN)
     */
    public String getTestStatus(ITestResult result) {
        if (result.getStatus() == ITestResult.SUCCESS) {
            return "PASSED";
        }
        return "FAILED";
    }
    
    /**
     * Get the test name from ITestResult
     * @param result The TestNG test result
     * @return The test method name
     */
    public String getTestName(ITestResult result) {
        return result.getMethod().getMethodName();
    }
    
    /**
     * Calculate execution time in milliseconds
     * @param result The TestNG test result
     * @return Execution time formatted as string with "ms" suffix
     */
    public String getExecutionTime(ITestResult result) {
        long executionTimeMs = result.getEndMillis() - result.getStartMillis();
        return executionTimeMs + " ms";
    }
    
    /**
     * Process test result and save to database
     * @param result The TestNG test result
     * @param databaseHelper The database helper instance
     */
    public void processAndSaveTestResult(ITestResult result, DatabaseHelper databaseHelper) {
        String testName = getTestName(result);
        String status = getTestStatus(result);
        String executionTime = getExecutionTime(result);
        
        databaseHelper.insertOrUpdateTestResult(testName, status, executionTime);
    }
}

