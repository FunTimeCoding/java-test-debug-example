package org.funtimecoding.java.test.debug.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ExampleMainTest {
    @Test
    public void testRun() {
        ExampleMain main = new ExampleMain();

        int result = main.run();

        assertEquals(result, 0);
    }
}
