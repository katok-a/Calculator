package Calculators;

public class LocalCalculator implements Calculator {

    float result;
    Add add;
    Subtract subtract;
    Multiply multiply;
    Divide divide;

    public LocalCalculator() {
        this.add = new Add();
        this.subtract = new Subtract();
        this.multiply = new Multiply();
        this.divide = new Divide();
    }

    @Override
    public float calculate(Formula formula) {
        if (formula == null) return 0;
        if (formula.getOperator() == null || formula.getOperator().isEmpty() || !"+-/*".contains(formula.getOperator())) {
            System.out.println("Calculators.Formula is not valid: Unsupported operator ");
            return 0;
        }

        switch (formula.getOperator()) {
            case "+" -> result = add.operate(formula.getOperand1(), formula.getOperand2());
            case "-" -> result = subtract.operate(formula.getOperand1(), formula.getOperand2());
            case "*" -> result = multiply.operate(formula.getOperand1(), formula.getOperand2());
            case "/" -> result = divide.operate(formula.getOperand1(), formula.getOperand2());
        }
        return result;
    }
}
