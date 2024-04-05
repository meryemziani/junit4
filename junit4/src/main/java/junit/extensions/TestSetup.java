package junit.extensions;

import junit.framework.Protectable;
import junit.framework.Test;
import junit.framework.TestResult;

/**
 * A Decorator to set up and tear down additional fixture state. Subclass
 * TestSetup and insert it into your tests when you want to set up additional
 * state once before the tests are run.
 */
public class TestSetup extends TestDecorator {

    public TestSetup(Test test) {
        super(test);
    }

    @Override
    public void run(final TestResult result) {
        Protectable p = new Protectable() {
            public void protect() throws Exception {
                setUp();
                basicRun(result);
                tearDown();
            }
        };
        result.runProtected(this, p);
    }

    /**
     * Sets up the fixture. Override to set up additional fixture state.
     */
    protected void setUp() throws Exception {
        throw new UnsupportedOperationException("setUp() method is not implemented");
    }

    /**
     * Tears down the fixture. Override to tear down the additional fixture
     * state.
     */
    protected void tearDown() throws Exception {
        // This method is intentionally left empty because the test teardown is not required for this particular test case.
        // If specific teardown actions are needed in the future, they should be added here.
        throw new UnsupportedOperationException("tearDown() method is not implemented");
    }
}