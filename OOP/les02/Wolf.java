public class Wolf extends Wild {

    protected boolean leader;
    public Wolf(int height, int weight, String eyeColor, String voice, String areal, int year, int month, int day, boolean leader) {
        super(height, weight, eyeColor, voice, areal, year, month, day);
        this.leader = leader;
        
    }
    public Wolf(){
        super(120,60,"blue","woooo","Siberia",2018,07,23);
    }
    @Override
    public String toString() {
        
        return String.format("%s %b", super.toString(), this.leader);
    }
    
}