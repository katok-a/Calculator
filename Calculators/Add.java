package Calculators;

public class Add implements Operation {
    @Override
    public float operate(float operand1, float operand2) {
        return operand1 + operand2;
    }
}
