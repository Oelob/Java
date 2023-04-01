package OOP.less05.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Phonebook implements Iterable<Contact>{
    
    private List<Contact> phonebook = new ArrayList<>();

     
    public void addContact(Contact obj){
        this.phonebook.add(obj);
    }

    public void delContact(int id){
        this.phonebook.remove(id);
    }

    public void setPhonebook(ArrayList<Contact> phonebook) {
        this.phonebook = phonebook;
    }

    

    @Override
    public Iterator<Contact> iterator() {
        return this.phonebook.iterator();
    }

   

   
   

    
}
