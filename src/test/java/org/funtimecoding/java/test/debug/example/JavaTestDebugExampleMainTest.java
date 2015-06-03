package org.funtimecoding.java.test.debug.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author shiin
 */
public class JavaTestDebugExampleMainTest {

    @Test
    public void testRun() {
        JavaTestDebugExampleMain main = new JavaTestDebugExampleMain();

        int result = main.run();

        assertEquals(result, 0);
    }
}
