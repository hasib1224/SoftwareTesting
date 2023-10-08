package Test;
import main.Calculator;
import org.junit.Before;

import org.junit.Test;

import static org.junit.Assert.*;
//import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(10, 5), 0.001);
        // Add more test cases for divide method
    }

    // @Test
    // public void testSquare() {
    //     assertEquals(25, calculator.square(5));
    //     // Add more test cases for square method
    // }

    @Test
    public void testPower() {
        assertEquals(8, calculator.power(2, 3));
        // Add more test cases for power method
    }

    @Test
    public void testFactorial() {
        assertEquals(120, calculator.factorial(5));
        // Add more test cases for factorial method
    }

    @Test
    public void testIsPrime() {
        assertTrue(calculator.isPrime(5));
        assertFalse(calculator.isPrime(4));
        // Add more test cases for isPrime method
    }

    @Test
    public void testFindPrimeNumbersInRange() {
        int[] primes = calculator.findPrimeNumbersInRange(10, 30);
        assertArrayEquals(new int[]{11, 13, 17, 19, 23, 29}, primes);
        // Add more test cases for findPrimeNumbersInRange method
    }

    @Test
    public void testGCD() {
        assertEquals(5, calculator.gcd(10, 15));
        // Add more test cases for gcd method
    }

    @Test
    public void testReverseString() {
        assertEquals("gnirtS", calculator.reverseString("String"));
        // Add more test cases for reverseString method
    }

    @Test
    public void testFindFibonacciSeries() {
        assertArrayEquals(new int[]{0, 1, 1, 2, 3, 5}, calculator.findFibonacciSeries(6));
        // Add more test cases for findFibonacciSeries method
    }

    @Test
    public void testCalculateTriangleArea() {
        assertEquals(12.0, calculator.calculateTriangleArea(6, 4), 0.001);
        // Add more test cases for calculateTriangleArea method
    }

    @Test
    public void testSortArray() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, calculator.sortArray(new int[]{5, 4, 3, 2, 1}));
        // Add more test cases for sortArray method
    }


}
