package classwork;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.sound.sampled.SourceDataLine;

public class program {
    
    
    public static void main(String[] args) {
        ArrayList<Schoolboy> schooboys = new ArrayList<Schoolboy>();
        
        Firstlevel stud1 = new Firstlevel("Ivan", "Ivanov", 7, 1);
        Midllevel stud2 = new Midllevel("Petr", "Petrov", 12, 6);
        Graduatelevel stud3 = new Graduatelevel("Vasilii", "Sidorov", 16, 11);

        schooboys.add(stud1);
        schooboys.add(stud2);
        schooboys.add(stud3);

        getMethods(schooboys);

        
    }
    
    public static void getMethods(ArrayList<Schoolboy>schoolboys) {
        
    
        for (Schoolboy schoolboy : schoolboys) {
            if (schoolboy instanceof Smoking){
                System.out.println(schoolboy);
                ((Smoking)schoolboy).Smoke();
            }
            if (schoolboy instanceof Game){
                System.out.println(schoolboy);
                ((Game)schoolboy).Gaming();
            }
        }

        for (Schoolboy schoolboy : schoolboys) {
            System.out.println(schoolboy);
            
            
        }
        
    }
}

