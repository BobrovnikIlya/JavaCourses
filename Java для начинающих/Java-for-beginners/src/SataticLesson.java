//Lesson 21
public class SataticLesson {
    public static void main(String[] args) {
        Humans h1 = new Humans("Bob", 40);
        Humans h2 = new Humans("Roma", 32);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
    }
}
class Humans{
    private String name;
    private int age;
    public static int countPeople;

    public Humans(String name, int age){
        this.age = age;
        this.name = name;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void printNumberOfPeople(){
        System.out.println("Number of people = " + countPeople);
    }

}

