package Calculators;

public class Divide implements Operation {
    @Override
    public float operate(float operand1, float operand2) {
        if (operand2 == 0) {
            System.out.println("Calculators.Formula is not valid");
            return 0;
        }else return operand1/operand2;
    }
}