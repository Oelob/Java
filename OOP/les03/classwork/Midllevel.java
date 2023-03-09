package classwork;

public class Midllevel extends Schoolboy implements Smoking, Game {

    public Midllevel(String name, String lastname, int age, int class_level) {
        super(name, lastname, age, class_level);
        
    }

    @Override
    public void Lerning() {
        System.out.println("Я ненавижу учиться");
    }

    @Override
    public void Smoke() {
        System.out.println("Я начинаю курить");
    }

    @Override
    public void Gaming() {
        System.out.println("Я играю Brawl Stars");
    }
    
}
