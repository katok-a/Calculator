package Calculators;

import java.util.HashMap;
import java.util.Map;

public class Operator {
    private String operator;
    private Operation operatorMethod;
    private Map<String, Operation> operationMap = Map.of(
            "+", new Add(),
            "-", new Subtract(),
            "*", new Multiply(),
            "/", new Divide()
    );


    Operator (String operator){
        this.operator = operator;
        this.operatorMethod = getOperatorMethod(operator);
    }

    Operation getOperatorMethod(String operator){
        Operation op = operationMap.get(operator);
        return op;
    }
    Boolean isOperatorValid(String operator){
        if (operationMap.containsKey(operator)){
            return true;
        }
        return false;
    }

    public String getOperator() {
        return operator;
    }

    public Operation getOperatorMethod() {
        return operatorMethod;
    }
}
