public class Formula {
    private float operand1;
    private float operand2;
    private String operator;

    public Formula (float opr1, float opr2, String oper){
        operand1 = opr1;
        operand2 = opr2;
        operator = oper;
    }

    public float getOperand1(){
        return operand1;
    }
    public void setOperand1(float opr1){
        this.operand1 = opr1;
    }
    public float getOperand2(){return operand2;}
    public void setOperand2(float opr2){
        this.operand2 = opr2;
    }
    public String getOperator(){
        return operator;
    }
    public void setOperator(String operator){
        this.operator = operator;
    }
}


