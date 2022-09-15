package Calculators;

import java.util.*;

public class ProxyCalculator implements Calculator, History{


    private Map<Formula, Float> operations = new HashMap<>();
    private Map<String, Operation> operationMap = new HashMap<>();
    Queue<String> operationsHistory =  new LinkedList<String>();



    @Override
    public float calculate(Formula formula) {
        if (formula == null) return 0;
        if (formula.getOperator() == null || formula.getOperator().isEmpty() || !"+-/*".contains(formula.getOperator())) {
            System.out.println("Calculators formula is not valid: Unsupported operator");
            return 0;
        }

        if (operations.containsKey(formula)) {
            return operations.get(formula);
        } else {
            Calculator cal = new LocalCalculator();
            Operator operator = new Operator(formula.getOperator());
            cal.addOperator(operator);
            //add result to operations cache
            float result = cal.calculate(formula);
            operations.put(formula, result);
            //add result to operations history as expression in list
            updateHistory(formula,result);
            return result;
        }
    }

    @Override
    public void addOperator(Operator operator) {
        System.out.println("hi");
    }

    @Override
    public void getLast(int number) {

        Iterator iterator = operationsHistory.iterator();
        int count = 0;
        System.out.println("latest "+ number +" calculations: \n");
        while (iterator.hasNext() && count <= number ) {
            System.out.print(iterator.next());
            count = count+1;
        }
        System.out.println("\n------------\n");

    }
    private void updateHistory (Formula formula, float result){
        String expression = "\n"+formula.getOperand1()+" "+formula.getOperator()+" "+formula.getOperand2()+" = "+result;
        operationsHistory.add(expression);
    }
}
