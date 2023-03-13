package OOP.less_figures;

public abstract class Polygon extends BaseFig implements Perimetr{


    public Polygon(String name) {
        super(name);
    }
    

    @Override
    public String toString() {
        return String.format("%s ", super.toString());
    }
}
