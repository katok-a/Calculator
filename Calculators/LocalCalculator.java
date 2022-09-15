package Calculators;

import java.util.HashMap;
import java.util.Map;

public class LocalCalculator implements Calculator {

    private Map<String, Operation> localOperationMap = new HashMap<>();


    @Override
    public float calculate(Formula formula) {
        Operation operationMapValue = null;
        if (localOperationMap.containsKey(formula.getOperator())) {
            operationMapValue = localOperationMap.get(formula.getOperator());
        } else {
            System.out.println("Invalid operator");
        }
        return operationMapValue.operate(formula.getOperand1(), formula.getOperand2());
    }

    @Override
    public void addOperator(Operator operator) {
        localOperationMap.put(operator.getOperator(), operator.getOperatorMethod());
    }
}
