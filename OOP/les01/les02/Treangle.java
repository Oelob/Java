package OOP.les01.les02;

public class Treangle extends Polygon{

    private double a;
    private double b;
    private double c;
    

    public Treangle(String name, double a, double b, double c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double calcPerimenter() {
        return a+b+c;
    }

    @Override
    double calcS() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }

    

    
}
