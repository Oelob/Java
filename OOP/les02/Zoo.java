import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> zoo = new ArrayList<>();

    public void addAnimal(Animal obj){
        this.zoo.add(obj);
    }
    
    public void deleteAnimal(int index){
        this.zoo.remove(index);
    }
    
    public String getInfo(int index){
        return this.zoo.get(index).toString();
    }

    public String getVoice(int index){
        return this.zoo.get(index).getVoice();
    }

    public StringBuilder getAllInfo(){
        StringBuilder result = new StringBuilder();
        for (Animal animal : zoo) {
            result.append(animal.toString() + "\n==============\n");  
        }
        return result;
    }

    public StringBuilder getRoar(){
        StringBuilder result = new StringBuilder();
        for (Animal animal : zoo) {
            result.append(animal.roar() + "\n");  
        }
        return result;
    }

    public boolean hasIndex(int index){
        if (index < this.zoo.size()){
            return true;
        }else{
            return false;
        }
        
    }


}
