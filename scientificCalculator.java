import java.util.*;
import java.lang.*;

public class scientificCalculator {
    Scanner sc = new Scanner(System.in);

    public void calculator() {
        System.out.println("\t\t\t\t----------------------------Scientific Calculator-----------------------------");
        System.out.println("\n");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter a command to proceed [0 --> Exit | 1 --> Continue]: ");
        int command = sc.nextInt();
        if (command == 1) {
            System.out.println("Welcome " + name);
            System.out.println("This calculator can be used to perform: ");
            System.out.println("Simple Calculation between two numbers: ");
            System.out.println("\n");
            System.out.println(
                    " '+' Addition\n'-' Subtraction\n'/' Division\n'*' Multiplication\n '%' Remainder Checking");
            System.out.println("\nScientific Calculation of any number: ");
            System.out.println("\n");
            System.out.println(" 'log' Logarithmic value\n'[sin | cos | tan]' Trigonometric function value\n'[sq. root 4 = 2]' Root value\n'e^x' Exponential value");
            System.out.println("\n");
            System.out.println("Enter Parameter to perform [1 --> One Number | 2 --> Two Numbers]: ");
            int parameter = sc.nextInt();
            if (parameter == 1) {
                System.out.println("Enter number to perform Scientific Operation: ");
                int num = sc.nextInt();
                System.out.println("Select operation to perform: ");
                System.out.println(
                        "log --> Log value\nex --> Exponential value\ntri --> Trigonometric value\nroot --> Root value\ncroot --> Cube Root value");
                String op = sc.next();
                switch (op) {
                    case "log":
                        System.out.println("Log of " + num + " (base 10) is: " + Math.log10(num));
                        break;
                    case "ex":
                        Exponential(num);
                        break;
                    case "tri":
                        Trigonometry(num);
                        break;
                    case "root":
                        System.out.println("Root value of " + num + " is: " + Math.sqrt(num));
                        break;
                    case "croot":
                        System.out.println("Cube Root value of " + num + " is: " + Math.cbrt(num));
                        break;
                    default:
                        System.out.println("Invalid input.");
                        calculator();
                }
            } else if (parameter == 2) {
                System.out.print("Enter First number: ");
                int num1 = sc.nextInt();
                System.out.print("Enter Second number: ");
                int num2 = sc.nextInt();
                System.out.println("Select operation to perform: ");
                System.out.println("+ --> Addition\n- --> Subtraction\n/ --> Division\n* --> Multiplication\n% --> Remainder of two numbers after division");
                String operation = sc.next();
                switch (operation) {
                    case "+":
                        System.out.println("Addition of " + num1 + " and " + num2 + " is: " + (num1 + num2));
                        break;
                    case "-":
                        System.out.println("Subtraction of " + num1 + " and " + num2 + " is: " + (num1 - num2));
                        break;
                    case "/":
                        System.out.println("Division of " + num1 + " and " + num2 + " is: " + (num1 / num2));
                        break;
                    case "*":
                        System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + (num1 * num2));
                        break;
                    case "%":
                        System.out.println("Remainder of " + num1 + " and " + num2 + " is: " + (num1 % num2));
                        break;
                    default:
                        System.out.println("Inavlid input.");
                        calculator();
                }
            }
        } else if (command == 0) {
            calculator();
        } else {
            System.out.println("Invalid input");
        }
    }

    public void Exponential(int num) {
        System.out.println("Enter the value of exponent: ");
        int exponent = sc.nextInt();
        double result = Math.pow(num, exponent);
        System.out.println("Exponential value of " + num + " is: " +result);
    }

    public void Trigonometry(int num) {
        System.out.println("Enter the function of Trigonometry[sin | cos | tan]: ");
        String func = sc.next();
        switch (func) {
            case "sin":
                System.out.println("Sin value of " + num + " is: " + Math.sin(num));
                break;
            case "cos":
                System.out.println("Cos value of " + num + " is: " + Math.cos(num));
                break;
            case "tan":
                System.out.println("Tan value of " + num + " is: " + Math.tan(num));
                break;
        }
    }

    public static void main(String[] args) {

        scientificCalculator obj = new scientificCalculator();
        obj.calculator();
    }

}