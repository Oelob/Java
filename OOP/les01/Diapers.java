package OOP.les01;

public class Diapers extends ChildPoduct {

    private int size;
    private double min_weight;
    private double max_weight;
    
    public Diapers (String name, double price, int count, String unitMeaString, int min_age, boolean alergic, double min_weight, double max_weight, int size) {
        super(name, price, count, unitMeaString, min_age, alergic);
        this.max_weight = max_weight;
        this.min_weight = min_weight;
        this.size = size;
        
    }

    public String toString(){
        return String.format(" %s Size: %d Min weight %.1f Max weight %.1f",
        super.toString(), this.size, this.min_weight, this.max_weight);
    }

    public int getSize(){
        return this.size;
    }
    public double getMinWeight(){
        return this.min_weight;
    }

    public double getMaxWeight(){
        return this.max_weight;
    }

    


    
}
