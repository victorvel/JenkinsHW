import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Calculator calc = new Calculator();

    boolean continueLoop = true;
    Scanner userInput;
    String command;
    int num1 = 0;
    int num2 = 0;

    while (continueLoop) {
      System.out.println("enter command: ");
      userInput = new Scanner(System.in);
      String[] arguments = userInput.nextLine().split(" ");
      command = arguments[0];
      if (arguments.length > 1) {
        num1 = Integer.parseInt(arguments[1]);
      }
      if (arguments.length > 2) {
        num2 = Integer.parseInt(arguments[2]);
      }

      if (command.equals("add")) {
        System.out.println(calc.add(num1, num2));
      } else if (command.equals("subtract")) {
        System.out.println(calc.subtract(num1, num2));
      } else if (command.equals("multiply")) {
        System.out.println(calc.multiply(num1, num2));
      } else if (command.equals("divide")) {
        System.out.println(calc.divide(num1, num2));
      } else if (command.equals("fibonacci")) {
        System.out.println(calc.fibonacciNumberFinder(num1));
      } else if (command.equals("binary")) {
        System.out.println(calc.intToBinaryNumber(num1));
      } else if (command.equals("exit")) {
        continueLoop = false;
      }
    }
  }
}
