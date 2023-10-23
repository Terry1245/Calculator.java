                 case "*":
import java.util.Scanner;

                        public class Calculator{
                            public static void main(String[] args) {
                                // Create a Scanner object to read input from the console
                                java.util.Scanner scanner = new Scanner(System.in);

                                // Prompt the user to enter a mathematical expression
                                System.out.println("5 - 2 + 8");

                                // Read the mathematical expression from the user
                                String expression = scanner.nextLine();

                                // Close the scanner to avoid resource leak
                                scanner.close();

                                try {
                                    // Evaluate and print the result
                                    double result = evaluateExpression(expression);
                                    System.out.println("Result: " + result);
                                    System.out.println(); // Move to a new line for better formatting
                                } catch (Exception e) {
                                    System.out.println("Error: " + e.getMessage());
                                }
                            }


                            private static double evaluateExpression(String expression) {
                                // Split the expression into individual operations
                                String[] operations = expression.split("\\s*(\\+/\\-/\\*/\\/|%)+\\s*");

                                // Initialize the result with the first operand
                                double result = Double.parseDouble(operations[0]);

                                // Iterate through the operations and operands and perform the calculations
                                for (int i = 1; i < operations.length; i++) {
                                    String operator = expression.replaceAll("[\\d.]", "").charAt(i * 2 - 1) + "";
                                    double operand = Double.parseDouble(operations[i]);

                                    switch (operator) {
                                        case "+":
                                            result += operand;
                                            break;
                                        case "-":
                                            result -= operand;
                                            break;
                                        result *= operand;
                        break;
                    case "/":
                        result /= operand;
                        break;
                    case "%":
                        result %= operand;
                        break;
                    default:
                        throw new RuntimeException("Invalid operator:" + operator);
                }


            }

            return result;

    }
}
