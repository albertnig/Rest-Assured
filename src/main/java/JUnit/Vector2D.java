package JUnit;

public class Vector2D {
    private double x;
    private double y;

    public void setX(double x){
        this.x = x;
    }
    public double getX(){
        return x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    public double length (){
        return Math.sqrt(x * x + y * y);
    }
}
