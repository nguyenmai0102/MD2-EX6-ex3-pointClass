package Poin;

public class PointClass {
    private float x = 0.0f;
    private float y = 0.0f;

    public PointClass() {
    }

    public PointClass(float x, float y) {
        this.x = x;
        this.y = y;

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;

    }
    public float[] getXY (){
float[] getXY ={x,y};
        return getXY;
    }

    @Override
    public String toString() {
        return "PointClass{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
