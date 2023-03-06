package OOP.les01.les02;

public abstract class Polygon extends BaseFig{


    public Polygon(String name) {
        super(name);
    }

    
    abstract double calcPerimenter();

    @Override
    public String toString() {
        return String.format("%s Периметр: %.2f", super.toString(), this.calcPerimenter());
    }
}
