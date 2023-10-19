package Collection.LinkedList;

import java.util.LinkedList;
//Lesson 7
//CollectionPackage.LinkedList - двухсвязный список. Удобен когда есть частое удаление и добавление элементов
// Не удобен когда надо часто что-то вызывать (get)
public class LinkedListEx1 {
    public static void main(String[] args) {
        Student2 st1 = new Student2("Ivan", 3);
        Student2 st2 = new Student2("Nikol", 4);
        Student2 st3 = new Student2("Anna", 3);
        Student2 st4 = new Student2("Viktoriya", 2);
        Student2 st5 = new Student2("Ilya", 4);

        LinkedList<Student2> student2LinkedList = new LinkedList<>();
        student2LinkedList.add(st1);
        student2LinkedList.add(st2);
        student2LinkedList.add(st3);
        student2LinkedList.add(st4);
        student2LinkedList.add(st5);

        System.out.println(student2LinkedList);

        System.out.println(student2LinkedList.get(2));

        Student2 st6 = new Student2("Zaur", 2);
        Student2 st7 = new Student2("Igor", 4);
        student2LinkedList.add(st6);
        student2LinkedList.add(1, st7);

        student2LinkedList.remove(3);

        System.out.println(student2LinkedList);
    }
}
class Student2 {
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name = " + name+ '\''+
                ", course = " + course + '}';
    }
}
