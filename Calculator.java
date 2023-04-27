import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /, or √): ");
        operator = scanner.next().charAt(0);

        if (operator == '√') {
            result = Math.sqrt(num1);
            System.out.println("The square root of " + num1 + " is " + result);
        } else {
            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                case '√':
                    result = Math.sqrt(num1);
                default:
                    System.out.println("Invalid operator");
                    return;
            }

            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }
    }
}
