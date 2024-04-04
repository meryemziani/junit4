package junit.tests.extensions;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestResult;
import junit.framework.TestSuite;

/**
 * Testing the RepeatedTestCaseDecorator support.
 */
public class RepeatedTestCaseDecorator extends TestCase {
    private TestSuite fSuite;

    public static class SuccessTest extends TestCase {

        @Override
        public void runTest() {
        }
    }

    public RepeatedTestCaseDecorator(String name) {
        super(name);
        fSuite = new TestSuite();
        fSuite.addTest(new SuccessTest());
        fSuite.addTest(new SuccessTest());
    }

    public void testRepeatedOnce() {
        Test test = new RepeatedTestCaseDecorator(fSuite, 1);
        assertEquals(2, test.countTestCases());
        TestResult result = new TestResult();
        test.run(result);
        assertEquals(2, result.runCount());
    }

    public void testRepeatedMoreThanOnce() {
        Test test = new RepeatedTestCaseDecorator(fSuite, 3);
        assertEquals(6, test.countTestCases());
        TestResult result = new TestResult();
        test.run(result);
        assertEquals(6, result.runCount());
    }

    public void testRepeatedZero() {
        Test test = new RepeatedTestCaseDecorator(fSuite, 0);
        assertEquals(0, test.countTestCases());
        TestResult result = new TestResult();
        test.run(result);
        assertEquals(0, result.runCount());
    }

    public void testRepeatedNegative() {
        try {
            new RepeatedTestCaseDecorator(fSuite, -1);
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains(">="));
            return;
        }
        fail("Should throw an IllegalArgumentException");
    }
}