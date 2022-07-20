
public class Calculators {

    float result;
    //Method for addition
    private float add(float num1, float num2){
        return num1+num2;
    }
    //Method for subtraction
    private float subtract(float num1, float num2){
        return num1-num2;
    }
    //Method for multiplication
    private float multiply(float num1, float num2){
        return num1*num2;
    }
    //Method for division
    private float divide(float num1, float num2){
        if (num2 == 0) {
            System.out.println("Formula is not valid");
            return 0;
        }else return num1/num2;
    }

    public float calculate(Formula formula) {


        if (formula == null) return 0;
        if (formula.getOperator() == null || formula.getOperator().isEmpty() || !"+-/*".contains(formula.getOperator())) {
            System.out.println("Formula is not valid: Unsupported operator "); return 0;
        }

        switch (formula.getOperator()) {
            case "+" -> result = add(formula.getOperand1(), formula.getOperand2());
            case "-" -> result = subtract(formula.getOperand1(), formula.getOperand2());
            case "*" -> result = multiply(formula.getOperand1(), formula.getOperand2());
            case "/" -> result = divide(formula.getOperand1(), formula.getOperand2());
        }
        return result;
    }
}
