package OOP.les01;

public class TualetPaper extends Hygiene {

    private int count_layer;

    public TualetPaper(String name, double price, int count, String unitMeaString, int count_package, int count_layer) {
        super(name, price, count, unitMeaString, count_package);
        this.count_layer = count_layer;
        
    }

    public String toString(){
        return String.format(" %s Count of layer: %d",  super.toString(), this.count_layer);

    }

    public int getCountLayer(){
        return this.count_layer;
    }
    
}
