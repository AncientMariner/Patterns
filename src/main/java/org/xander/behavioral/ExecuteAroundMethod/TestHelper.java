package org.xander.behavioral.ExecuteAroundMethod;

import static org.junit.Assert.fail;

public class TestHelper {
    public static <X extends Throwable> Throwable assertThrows(final Class<X> exceptionClass,
                                                               final Runnable block) {
        try {
            block.run();
        } catch (Throwable e) {
            if (exceptionClass.isInstance(e)) {
                return e;
            }
        }
        fail("Failed to throw expected exception");
        return null;
    }
}
