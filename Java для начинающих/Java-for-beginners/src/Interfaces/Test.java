package Interfaces;
//Lesson 26
public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal(1);
        Person person = new Person("Bob");
        outputInfo(animal);
        outputInfo(person);
        Info info1 = new Animal(2);
        Info info2 = new Person("Anna");
        outputInfo(info1);
        outputInfo(info2);
    }
    public static void outputInfo(Info info){
        info.showInfo();
    }
}
