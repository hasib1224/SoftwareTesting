import Test.CalculatorTest;


//public class Main {
//    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//
//        // Example usage of Calculator methods
//        int sum = calculator.add(5, 3);
//        int product = calculator.multiply(4, 7);
//        double divisionResult = calculator.divide(10, 2);
//
//        // Print the results
//        System.out.println("Sum: " + sum);
//        System.out.println("Product: " + product);
//        System.out.println("Division Result: " + divisionResult);
//    }
//}



import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {

    public static void main(String[] args) {
        // Create an instance of JUnitCore
        JUnitCore junit = new JUnitCore();

        // Run the CalculatorTest class
        Result result = junit.run(CalculatorTest.class);

        // Check if the tests passed or failed
        if (result.wasSuccessful()) {
            System.out.println("All tests passed.");
        } else {
            System.out.println("Test failures:");

            // Iterate through the failures and print them
            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }
        }
    }
}
