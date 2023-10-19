//Lesson 14
public class ClassAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Roma");
        person1.setAge(18);
        person1.speak();
    }
}
class Person{
    private String name;
    private int age;
    public void setName(String name){
        if(name.isEmpty()) {
            System.out.println("Ты ввел пустое имя");
        }else{
            this.name = name;
        }
    }

    public String getName(){
        return name;
    }
    public void setAge(int age){
        if(age<0){
            System.out.println("Некоретный ввод данных!");
        }else {
            this.age = age;
        }
    }
    public int getAge(){
        return age;
    }
    public int calculateYearsToRetirement(){
        int years = 65-age;
        return years;
    }
    public void speak(){
        System.out.println("Меня зовут " + name + ", мне " + age + " лет");
    }
    public void sayHello() {
        System.out.println("Hello");
    }
}
