import Calculators.Calculator;
import Calculators.LocalCalculator;
import Calculators.Formula;
import Calculators.ProxyCalculator;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ProxyCalculator cal = new ProxyCalculator();

        while(true) {

            System.out.println("Enter first number");
            float firstNumber = Float.parseFloat(scan.nextLine());

            System.out.println("Enter second number");
            float secondNumber = Float.parseFloat(scan.nextLine());

            System.out.println("Enter operation symbol");
            String operator = scan.nextLine();

            Formula formula = new Formula(firstNumber, secondNumber, operator);

            float result = cal.calculate(formula);

            System.out.println("Result = " + result);
            //asking for new input
            System.out.println("Choose an option: \n" +
                    "1. Perform another calculation \n"+
                    "2. Show last 5 calculations \n"+
                    "3. Exit");
            String choice = scan.nextLine();

            switch (choice){
                case "1" -> {continue;}
                case "2" -> {
                    System.out.println("Enter number of last operations to show");
                    int number = Integer.parseInt(scan.nextLine());
                    cal.getLast(number);}
                case "3" -> { break;}}
        }
    }
}
