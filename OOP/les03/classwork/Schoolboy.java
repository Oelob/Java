package classwork;

import sem05_homework.algLi;

public abstract class Schoolboy {
    private String name;
    private String lastname;
    private int age;
    private int class_level;

    public Schoolboy(String name, String lastname, int age, int class_level){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.class_level = class_level;
    }

    @Override
    public String toString() {
        return String.format("Name %s\nLastname %s\nAge %d\nClass %d", 
        this.name, this.lastname, this.age, this.class_level);
    }

    public abstract void Lerning();

}
