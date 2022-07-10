public class Formula {
    private float x;
    private float y;
    private String op;

    public Formula (float opr1, float opr2, String operator){
        x = opr1;
        y = opr2;
        op = operator;
    }

    public float getX(){
        return x;
    }
    public void setX(float x){
        this.x = x;
    }
    public float getY(){
        return y;
    }
    public void setY(float y){
        this.y = y;
    }
    public String getOp(){
        return op;
    }
    public void setOp(String op){
        this.op = op;
    }
}


