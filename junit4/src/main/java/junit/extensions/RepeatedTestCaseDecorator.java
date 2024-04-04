package junit.extensions;

import junit.framework.Test;
import junit.framework.TestResult;

/**
 * A Decorator that runs a test repeatedly.
 */
public class RepeatedTestCaseDecorator extends TestDecorator {
    private final int repeatCount;

    public RepeatedTestCaseDecorator(Test test, int repeat) {
        super(test);
        if (repeat < 0) {
            throw new IllegalArgumentException("Repetition count must be >= 0");
        }
        repeatCount = repeat;
    }

    @Override
    public int countTestCases() {
        return super.countTestCases() * repeatCount;
    }

    @Override
    public void run(TestResult result) {
        for (int i = 0; i < repeatCount; i++) {
            if (result.shouldStop()) {
                break;
            }
            super.run(result);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "(repeated)";
    }
}