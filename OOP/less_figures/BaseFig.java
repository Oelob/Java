package OOP.less_figures;

public abstract class BaseFig {
    private String name;
    

    public BaseFig(String name){
        this.name = name;
    }

    
    
    public abstract double calcS() throws RadiusException, SideException;


    @Override
    public String toString(){
        try {
            return String.format("Name: %s Площадь: %.2f",this.name, calcS());
        } catch (RadiusException | SideException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return name;
    }
    public abstract void set();
}
