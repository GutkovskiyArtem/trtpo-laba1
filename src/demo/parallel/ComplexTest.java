package demo.parallel;

import static org.junit.Assert.assertEquals;


public class ComplexTest {

    private static final double DELTA = 1e-9;
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
        Complex result = c1.divide(c2);

        // Сравнение реальной и мнимой частей с допуском
        assertEquals(1.5, result.getRe(), DELTA);
        assertEquals(-0.5, result.getIm(), DELTA);
    }
}