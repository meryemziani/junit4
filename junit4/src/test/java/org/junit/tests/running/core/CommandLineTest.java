package org.junit.tests.running.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.MainRunner;

public class CommandLineTest {
    private ByteArrayOutputStream results;
    private PrintStream oldOut;
    private static boolean testWasRun;

    @Before
    public void before() {
        oldOut = System.out;
        results = new ByteArrayOutputStream();
        System.setOut(new PrintStream(results));
    }

    @After
    public void after() {
        System.setOut(oldOut);
    }

    public static class Example {
        @Test
        public void test() {
            testWasRun = true;
        }
    }

    @Test
    public void runATest() {
        testWasRun = false;
        MainRunner.runMain(Example.class.getName());
        assertTrue(testWasRun);
    }

    @Test
    public void runAClass() {
        testWasRun = false;
        JUnitCore.runClasses(Example.class);
        assertTrue(testWasRun);
    }

    private static int fCount;

    public static class Count {
        @Test
        public void increment() {
            fCount++;
        }
    }

    @Test
    public void runTwoClassesAsArray() {
        fCount = 0;
        JUnitCore.runClasses(Count.class, Count.class);
        assertEquals(2, fCount);
    }

    @Test
    public void runTwoClasses() {
        fCount = 0;
        JUnitCore.runClasses(Count.class, Count.class);
        assertEquals(2, fCount);
    }
}
