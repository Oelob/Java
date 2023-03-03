package OOP.les01;

public class Hygiene extends BaseProduct{

    private int count_package;
    
    public Hygiene(String name, double price, int count, String unitMeaString, int count_package) {
        super(name, price, count, unitMeaString);
        this.count_package = count_package;
        
    }

    public String toString(){
        return String.format("%s Count Package: %d ", super.toString(), this.count_package);
    }

    public int getCountPackage(){
        return this.count_package;
    }
}
