package OOP.les01;

import sem01_homework.program;

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

    public String getInfo(){
        return String.format("Name: %s Price %.2f Count %d UnitMeasure %s",
        this.name, this.price, this.count, this.unitMeasure);
    }

    public String toString(){
        return getInfo();
    }
}
