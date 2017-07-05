package org.xander.behavioral.ExecuteAroundMethod;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.xander.behavioral.ExecuteAroundMethod.TestHelper.assertThrows;

public class CheckerWithExceptionTest {
    private CheckerWithException checkerWithException = new CheckerWithException();
    @Test
    public void checkValueTerseWay() throws Exception {
        try {
            checkerWithException.checkValue(0);
            fail("Expected exception for zero length");
        } catch (IllegalArgumentException e) {
            assertTrue("expected", true);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkValueTerseWay2() throws Exception {
        checkerWithException.checkValue(0);
    }

    @Test
    public void checkValueBetterWay() throws Exception {
        assertThrows(IllegalArgumentException.class, () -> checkerWithException.checkValue(0));
    }
}