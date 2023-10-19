package Transformations;
//Lesson 32
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //Upcasting - Восходящее преобразование
        Animal animal = dog;

        //Downcasting
        Dog dog2 = (Dog) animal;
        dog2.bark();

        Animal a = new Animal();
        Dog d = (Dog)a;
        d.bark();
    }
}
