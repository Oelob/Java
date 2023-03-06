package OOP.les01.les02;

public class Rectangle extends Polygon{
    private double a;
    private double b;

    public Rectangle(String name, double a, double b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    
    public double calcPerimenter() {
        return (a+b)*2;
    }

    @Override
    double calcS() {
        return a*b;
    }
    
}
