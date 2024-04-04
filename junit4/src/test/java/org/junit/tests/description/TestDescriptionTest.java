package org.junit.tests.description;

import org.junit.Test;
import org.junit.runner.Description;

import static org.junit.Assert.*;

public class TestDescriptionTest {
    @Test
    public void equalsIsFalseForNonTestDescription() {
        assertNotEquals(Description.createTestDescription(getClass(), "a"), Integer.valueOf(5));
    }

    @Test
    public void equalsIsTrueForSameNameAndNoExplicitUniqueId() {
        assertEquals(Description.createSuiteDescription("Hello"), Description.createSuiteDescription("Hello"));
    }

    @Test
    public void equalsIsFalseForSameNameAndDifferentUniqueId() {
        assertNotEquals(Description.createSuiteDescription("Hello", 2), Description.createSuiteDescription("Hello", 3));
    }
}