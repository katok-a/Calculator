
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
        if (formula.getOp() == null || formula.getOp().isEmpty() || !"+-/*".contains(formula.getOp())) {
            System.out.println("Formula is not valid: Unsupported operator "); return 0;
        }

        switch (formula.getOp()) {
            case "+" -> result = add(formula.getX(), formula.getY());
            case "-" -> result = subtract(formula.getX(), formula.getY());
            case "*" -> result = multiply(formula.getX(), formula.getY());
            case "/" -> result = divide(formula.getX(), formula.getY());
        }
        return result;
    }
}
