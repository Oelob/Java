import java.time.LocalDate;
import java.util.Random;

public class Dog extends Pet {

    protected boolean isTrained;

    public Dog(int height, int weight, String eyeColor, String voice, String name, String breed, boolean isVaccinated,
            String woolColor, int year, int month, int day, boolean isTrained) {
        super(height, weight, eyeColor, voice, name, breed, isVaccinated, woolColor, year, month, day);
        this.isTrained = isTrained;
    }

    @Override
    public void showCaress() {
        System.out.println("Woof-woof, the dog turn around man");;
    }
    
    public boolean getTrained() {
        return getTrained();
    }

    @Override
    public String toString() {
        String result = String.format("%s\nДрессирована: %b",
        super.toString(), this.isTrained);
        return result;
    }
    
    
    public void Training(){
        
        double skill = 0;
        boolean sit;
        Random r = new Random();
        if (this.isTrained == false){
            while (skill<1){

                System.out.println("Sit down!");
                sit = r.nextBoolean();
                if (sit == true){
                    System.out.println("The dog has sat down");
                    System.out.println("Good boy! Get take this yummy");
                    skill+=0.1;
                }else{
                    System.out.println("The dog hasn't sat down");
                    System.out.println("Let's try again!");
                }
            }
        }            
        else{
            System.out.println("Your dog has already trained!");
        }
        this.isTrained = true;
    }
}
                
                

        
        
        