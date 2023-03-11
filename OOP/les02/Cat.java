public class Cat extends Pet{

    protected boolean isWool;

    public Cat(int height, int weight, String eyeColor, String voice, String name, String breed, boolean isVaccinated,
            String woolColor, int year, int month, int day, boolean isWool) {
        super(height, weight, eyeColor, voice, name, breed, isVaccinated, woolColor, year, month, day);
        this.isWool = isWool;
        if (isWool == false) {
            this.woolColor = "Bold";
        }
        
    }
    public Cat(){
        super(20, 10, "orange", "mau", "murzik", "persian", true, "white", 2019, 06, 15);
        this.isWool = true;
    };

    @Override
    public void showCaress() {
       System.out.println("mur-miaaauuu!!!");
        
    }

    @Override
    public String toString() {
        String result = String.format("%s\nЕсть шерсть: %b",
        super.toString(), this.isWool);
        return result;
        
    }

    

    
}
