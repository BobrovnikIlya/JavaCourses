//Lesson 24
public class ClassObject {
    public static void main(String[] args) {
        People p1 = new People("Bob", 14);
        System.out.println(p1);
    }
}
class People{
    private String name;
    private int age;
    public People(String name, int age){
        this.age = age;
        this.name = name;
    }
    public String toString(){
        return name + ", "+ age;
    }
}
