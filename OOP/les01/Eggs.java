package OOP.les01;

public class Eggs extends Food{

    private int count_package;
    
    public Eggs(String name, double price, int count, String unitMeaString, int year, int month, int day, int count_package) {
        super(name, price, count, unitMeaString, year, month, day);
        this.count_package = count_package;
        
    }

    public String toString(){
        return String.format(" %s Count into package: %d",  super.toString(), this.count_package);
    }
    
    public int getCountPackage(){
        return this.count_package;
    }
}
