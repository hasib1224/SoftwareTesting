package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {

     public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    public int square(int a) {
        return a * a;
    }

    public int cube(int a) {
        return a * a * a;
    }

    public int power(int base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Exponent must be non-negative");
        }
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (n == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int[] findPrimeNumbersInRange(int start, int end) {
        if (start > end || start < 0 || end < 0) {
            throw new IllegalArgumentException("Invalid input range");
        }

        List<Integer> primes = new ArrayList<>();
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }

        int[] primeArray = new int[primes.size()];
        for (int i = 0; i < primes.size(); i++) {
            primeArray[i] = primes.get(i);
        }
        return primeArray;
    }

    public int gcd(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Input values must be non-negative");
        }
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public String reverseString(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        return new StringBuilder(input).reverse().toString();
    }



    public int[] findFibonacciSeries(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input value must be non-negative");
        }

        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        if (n > 1) {
            fibonacci[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci;
    }

    public double calculateTriangleArea(double base, double height) {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Base and height must be positive numbers");
        }
        return 0.5 * base * height;
    }

    public int[] sortArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }
        int[] sortedArray = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArray);
        return sortedArray;
    }




    public String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }
}
