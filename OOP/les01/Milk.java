package OOP.les01;

import java.time.LocalDate;


public class Milk extends Drinks{

    private double fat;
    private LocalDate storage_life;
    
    public Milk(String name, double price, int count, String unitMeaString, int vol, double fat, int year, int month, int day) {
        super(name, price, count, unitMeaString, vol);
        this.fat = fat;
        this.storage_life = LocalDate.of(year, month, day);
    }
    
    public String toString(){
        return String.format("%s Fat: %.2f Storage life: %s ", super.toString(), this.fat, this.storage_life);
    }

    public double getFat(){
        return this.fat;
    }

    public LocalDate getStorageLife(){
        return this.storage_life;
    }

}
