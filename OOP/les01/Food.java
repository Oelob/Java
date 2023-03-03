package OOP.les01;

public class Food extends BaseProduct {

    private int storage_life;

   
    public Food(String name, double price, int count, String unitMeaString, int storage_life) {
        super(name, price, count, unitMeaString);
        this.storage_life = storage_life;
    }
    
    public String getInfo() {
        return String.format("Storage life: %s %s", this.storage_life, super.getInfo());
    }
    
}
