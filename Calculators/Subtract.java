package Calculators;

public class Subtract implements Operation {
    @Override
    public float operate(float operand1, float operand2) {
        return operand1 - operand2;
    }
}
