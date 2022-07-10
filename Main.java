import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        float firstNumber = Float.parseFloat(scan.nextLine());

        System.out.println("Enter second number");
        float secondNumber = Float.parseFloat(scan.nextLine());

        System.out.println("Enter operation symbol");
        String operator = scan.nextLine();

        Formula formula = new Formula(firstNumber, secondNumber, operator);

        Calculators cal = new Calculators();

        float result = cal.calculate(formula);
        System.out.println("Result = "+ result);

    }

}