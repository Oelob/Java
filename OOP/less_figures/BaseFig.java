package OOP.less_figures;

public abstract class BaseFig {
    private String name;
    

    public BaseFig(String name){
        this.name = name;
    }

    
    
    public abstract double calcS();


    @Override
    public String toString(){
        return String.format("Name: %s Площадь: %.2f",this.name, calcS());
    }
    public abstract void set();
}
