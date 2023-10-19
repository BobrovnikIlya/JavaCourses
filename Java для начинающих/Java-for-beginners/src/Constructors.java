//Lesson 20
public class Constructors {
    public static void main(String[] args) {
        Human human1 = new Human("Bob", 12);
    }
}

class Human{
    public Human(){
        System.out.println("Hello from first constructor");
        this.name = "Default name";
        this.age = 0;
    }

    public Human(String name){
        System.out.println("Hello from second constructor");
        this.name=name;
    }

    public Human(String name, int age){
        System.out.println("Hello from third constructor");
        this.name=name;
        this.age=age;
    }

    private String name;
    private int age;

    public void setName(String name) {this.name = name;}
    public void setAge(int age){ this.age = age;}
}
