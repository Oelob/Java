package classwork;

import javax.sound.sampled.SourceDataLine;

public class Firstlevel extends Schoolboy implements Game{

    public Firstlevel(String name, String lastname, int age, int class_level) {
        super(name, lastname, age, class_level);
        
    }

    public void getProdlenka(){
        System.out.println("Я хожу в продлёнку");
    }

    @Override
    public void Lerning() {
        System.out.println("Я люблю учиться");
    }

    @Override
    public void Gaming() {
        System.out.println("Я играю в игрушки");
        
    }

    
    
}
