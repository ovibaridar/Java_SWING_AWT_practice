package calculationsolver;
import java.util.Stack;

public class CalculationSolver {
    public static void main(String[] args) {
        String calculation = "1+2.1/2*3"; // Replace with your calculation string

        try {
            double result = solveCalculation(calculation);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("An error occurred while solving the calculation: " + e.getMessage());
        }
    }

    public static double solveCalculation(String calculation) {
        String[] tokens = calculation.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)|(?<=\\D)(?=\\D)");

        Stack<Double> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (String token : tokens) {
            token = token.trim();

            if (token.isEmpty()) {
                continue;
            } else if (isNumber(token)) {
                numbers.push(Double.parseDouble(token));
            } else if (isOperator(token.charAt(0))) {
                while (!operators.isEmpty() && isOperator(operators.peek()) &&
                        hasPrecedence(operators.peek(), token.charAt(0))) {
                    performOperation(numbers, operators);
                }
                operators.push(token.charAt(0));
            } else {
                throw new IllegalArgumentException("Invalid token: " + token);
            }
        }

        while (!operators.isEmpty()) {
            performOperation(numbers, operators);
        }

        if (numbers.size() != 1) {
            throw new IllegalArgumentException("Invalid expression");
        }

        return numbers.pop();
    }

    private static boolean isNumber(String token) {
        return token.matches("-?\\d+(\\.\\d+)?");
    }

    private static boolean isOperator(char token) {
        return token == '+' || token == '-' || token == '*' || token == '/' || token == '%';
    }

    private static boolean hasPrecedence(char op1, char op2) {
        if ((op1 == '*' || op1 == '/' || op1 == '%') && (op2 == '+' || op2 == '-')) {
            return true;
        }
        return false;
    }

    private static void performOperation(Stack<Double> numbers, Stack<Character> operators) {
        char operator = operators.pop();
        double num2 = numbers.pop();
        double num1 = numbers.pop();

        switch (operator) {
            case '+':
                numbers.push(num1 + num2);
                break;
            case '-':
                numbers.push(num1 - num2);
                break;
            case '*':
                numbers.push(num1 * num2);
                break;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("Division by zero is not allowed");
                }
                numbers.push(num1 / num2);
                break;
            case '%':
                if (num2 == 0) {
                    throw new ArithmeticException("Division by zero is not allowed");
                }
                numbers.push(num1 % num2);
                break;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
