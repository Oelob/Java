package OOP.les01.les02;

public abstract class BaseFig {
    private String name;
    

    public BaseFig(String name){
        this.name = name;
    }

    
    // abstract double calcPerimenter();
    abstract double calcS();


    @Override
    public String toString(){
        return String.format("Name: %s Площадь: %.2f",this.name, this.calcS());
    }
    
}
