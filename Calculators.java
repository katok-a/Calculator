
public class Calculators {

    float result;
    //Method for addition
    public float add(float num1, float num2){
        result = num1+num2;
        return result;
    }
    //Method for subtraction
    public float subtract(float num1, float num2){
        result = num1-num2;
        return result;
    }
    //Method for multiplication
    public float multiply(float num1, float num2){
        result = num1*num2;
        return result;
    }
    //Method for division
    public float divide(float num1, float num2){
        result = num1/num2;
        return result;
    }

    public float calculate(Formula formula) {


        if (formula == null) return 0;
        if (formula.getOp() == null || formula.getOp().isEmpty() || !"+-/*".contains(formula.getOp())) {
            System.out.println("Formula is not valid: Unsupported operator "); return 0;
        }

        switch (formula.getOp()) {
            case "+" -> result = add(formula.getX(), formula.getY());
            case "-" -> result = subtract(formula.getX(), formula.getY());
            case "*" -> result = multiply(formula.getX(), formula.getY());
            case "/" -> {
                if (formula.getY() == 0) {
                    System.out.println("Formula is not valid");
                    return 0;
                }
                result = divide(formula.getX(), formula.getY());
            }
        }
        return result;
    }
}
