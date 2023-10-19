package MethodEquals;
//Lesson 42
public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);

        System.out.println(animal1.equals(animal2));

        //String Pool
        String string1 = "Hello";
        String string2 = "Hello";

        System.out.println(string1.equals(string2));
    }

}

class Animal{
    private int id;
    public Animal(int id){
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;
        return this.id==otherAnimal.id;
    }
}