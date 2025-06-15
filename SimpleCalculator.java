import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Simple Calculator in Java");
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
            
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            
            double result;
            
            switch (operator) {
                case '+' -> {
                    result = num1 + num2;
                    System.out.println("Result = " + result);
                }
                case '-' -> {
                    result = num1 - num2;
                    System.out.println("Result = " + result);
                }
                case '*' -> {
                    result = num1 * num2;
                    System.out.println("Result = " + result);
                }
                case '/' -> {
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result = " + result);
                    } else {
                        System.out.println("Error: Cannot divide by zero!");
                    }
                }
                default -> System.out.println("Invalid operator!");
            }
        }
}
}



       


