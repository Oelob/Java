package OOP.les01;

public class ChildPoduct extends BaseProduct {

    private int min_age;
    private boolean alergic;

    public ChildPoduct(String name, double price, int count, String unitMeaString, int min_age, boolean alergic) {
        super(name, price, count, unitMeaString);
        this.min_age = min_age;
        this.alergic = alergic;

    }
   
    public String toString(){
        return String.format("%s Minimal age: %d Alergic: %b ", super.toString(), this.min_age, this.alergic);
    }

    public int getMinAge(){
        return this.min_age;
    }
    
    public boolean getAlergic(){
        return this.alergic;
    }


}
