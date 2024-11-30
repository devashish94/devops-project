package com.devashish94;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    // Test for the add method
    @Test
    void testAdd() {
        App app = new App();
        assertEquals(5, app.add(2, 3), "The addition of 2 and 3 should be 5");
    }

    // Test for the subtract method
    @Test
    void testSubtract() {
        App app = new App();
        assertEquals(1, app.subtract(3, 2), "The subtraction of 3 and 2 should be 1");
    }
}
