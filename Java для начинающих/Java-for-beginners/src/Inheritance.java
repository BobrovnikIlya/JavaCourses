//Lesson 25
public class Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
    }
}

class Animal{
    protected String name;
    public void eat(){
        System.out.println("I'm eating");
    }
    public void sleep(){
        System.out.println("I'm sleeping");
    }
}

class Dog extends Animal{
    public void eat() {
        System.out.println("Dog is eating");
    }
    public void bark(){
        System.out.println("I am barking");
    }
    public void showName() {
        System.out.println(name);
    }
}