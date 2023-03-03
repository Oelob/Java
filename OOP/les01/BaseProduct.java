package OOP.les01;



public class BaseProduct {
    private String name;
    private double price;
    private int count;
    private String unitMeasure;

    public BaseProduct(String name, double price, int count, String unitMeaString){
        this.name = name;
        this.price = price;
        this.count = count;
        this.unitMeasure = unitMeaString;
    }

    
    public String toString(){
        return String.format("Name: %s Price: %.2f Count: %d UnitMeasure: %s",
        this.name, this.price, this.count, this.unitMeasure);
    }

    public void setPrice(double price){
        this.price = price;
    }

    
    public void setCount(int count){
        this.count = count;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public int getCount(){
        return this.count;
    }

    public String getUnitMeasure(){
        return this.unitMeasure;
    }
}
