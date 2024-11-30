package com.devashish94;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    // Test for the add method
    @Test
    void testAdd() {
        App app = new App();
        assertEquals(5, app.add(2, 3), "The addition of 2 and 3 should be 5.");
        assertEquals(-1, app.add(-2, -3), "The addition of -2 and -3 should be -5.");
        assertEquals(1, app.add(-2, 3), "The addition of -2 and 3 should be 1.");
    }

    // Test for the subtract method
    @Test
    void testSubtract() {
        App app = new App();
        assertEquals(1, app.subtract(3, 2), "The subtraction of 3 and 2 should be 1.");
        assertEquals(-1, app.subtract(2, 3), "The subtraction of 2 and 3 should be -1.");
        assertEquals(5, app.subtract(2, -3), "The subtraction of 2 and -3 should be 5.");
    }

    // Test for the multiply method
    @Test
    void testMultiply() {
        App app = new App();
        assertEquals(6, app.multiply(2, 3), "The multiplication of 2 and 3 should be 6.");
        assertEquals(-6, app.multiply(-2, 3), "The multiplication of -2 and 3 should be -6.");
        assertEquals(0, app.multiply(0, 5), "The multiplication of 0 and 5 should be 0.");
        assertEquals(2000000, app.multiply(1000, 2000), "The multiplication of 1000 and 2000 should be 2000000.");
    }

    // Test for the divide method
    @Test
    void testDivide() {
        App app = new App();
        assertEquals(2.5, app.divide(5, 2), 0.001, "The division of 5 by 2 should be 2.5.");
        assertEquals(-2.5, app.divide(-5, 2), 0.001, "The division of -5 by 2 should be -2.5.");
        assertEquals(0, app.divide(0, 5), 0.001, "The division of 0 by 5 should be 0.");
        assertThrows(ArithmeticException.class, () -> app.divide(5, 0), "Division by zero should throw an ArithmeticException.");
    }
}
