package OOP.les01;

public class Bread extends Food{

    private String type_flour;
    
    public Bread(String name, double price, int count, String unitMeaString, int year, int month, int day, String type_flour) {
        super(name, price, count, unitMeaString, year, month, day);
        this.type_flour = type_flour;
        
    }

    public String toString(){
        return String.format(" %s Type of flour: %s",  super.toString(), this.type_flour);
    }
    
    public String getTypeFlour(){
        return this.type_flour;
    }


}
