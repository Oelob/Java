package classwork;

public class Graduatelevel extends Schoolboy implements Smoking {

    public Graduatelevel(String name, String lastname, int age, int class_level) {
        super(name, lastname, age, class_level);
        
    }

    public void getLove(){
        System.out.println("Я ищу себе пару");
    }

    @Override
    public void Lerning() {
        System.out.println("Я должен учиться");
    }

    @Override
    public void Smoke() {
        System.out.println("Я бросаю курить");
        
    }

    
    
}
