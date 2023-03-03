package OOP.les01;

import java.time.LocalDate;
import java.time.Year;

public class Food extends BaseProduct {

    private LocalDate storage_life;

   
    public Food(String name, double price, int count, String unitMeaString, int year, int month, int day) {
        super(name, price, count, unitMeaString);
        this.storage_life = LocalDate.of(year, month, day);
    }
    
       
    public String toString(){
        return String.format(" %s Storage life: %s",  super.toString(), this.storage_life);
    }

    public LocalDate getStorageLife(){
        return this.storage_life;
    }

    public void setStorageLife(int year, int month, int day){
        this.storage_life = LocalDate.of(year, month, month);
    }
}
