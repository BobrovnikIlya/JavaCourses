package Serialization;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = -1412416786874124124L;
    //private transient int id; //не будет сериализоваться
    private int id;
    private String personName;
    private int age;

    public Person(int id, String name){
        this.id = id;
        this.personName = name;
    }

    public int getId() {
        return id;
    }
    public String getName(){
        return personName;
    }

    public String toString(){
        return id+" " + personName;
    }
}
