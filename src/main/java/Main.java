import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    String command = args[0];
    int num1 = Integer.parseInt(args[1]);
    int num2 = Integer.parseInt(args[2]);
    Calculator calc = new Calculator();

    if (command.equals("add")) {
      System.out.println(calc.add(num1, num2));
    }
    else if (command.equals("subtract")) {
      System.out.println(calc.subtract(num1, num2));
    }
    else if (command.equals("multiply")) {
      System.out.println(calc.multiply(num1, num2));
    }
    else if (command.equals("divide")) {
      System.out.println(calc.divide(num1, num2));
    }
    else if (command.equals("fibonacci")) {
      System.out.println(calc.fibonacciNumberFinder(num1));
    }
    else if (command.equals("binary")) {
      System.out.println(calc.intToBinaryNumber(num1));
    }
  }
}
