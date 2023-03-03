package OOP.les01;

public class Drinks extends BaseProduct {

    private double vol;

    public Drinks(String name, double price, int count, String unitMeaString, double vol) {
        super(name, price, count, unitMeaString);
        this.vol = vol;
    }
    
   
    public String toString(){
        return String.format(" %s Volume: %.2f", super.toString(), this.vol);
    }

    public double getVol(){
        return this.vol;
    }

}
