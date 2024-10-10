package demo.parallel;

import static org.junit.Assert.assertEquals;

public class ComplexTest {

    @org.junit.Test
    public void testAddition() {
        Complex c1 = new Complex(1, 1);
        Complex c2 = new Complex(2, 2);
        assertEquals(new Complex(3, 3), c1.plus(c2));
    }

    @org.junit.Test
    public void testDivision() {
        Complex c1 = new Complex(4, 2);
        Complex c2 = new Complex(2, 2);
        assertEquals(new Complex(1, -1), c1.divide(c2));
    }
}
