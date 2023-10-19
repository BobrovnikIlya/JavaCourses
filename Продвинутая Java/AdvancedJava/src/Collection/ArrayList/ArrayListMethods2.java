package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        Student st1 = new Student("Bob", 'm', 22,3,8.3);
        Student st2 = new Student("Victoriya", 'w',21,2,9.0);
        Student st3 = new Student("Ilya", 'm',20,4,9.2);
        Student st4 = new Student("Boris", 'm', 17,1,6.8);
        Student st5 = new Student("Elena", 'w', 19,2,5.9);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
        System.out.println(studentList);

        Student st6 = new Student("Elena", 'w', 19,2,5.9);

        int index = studentList.indexOf(st6);

        //studentList.remove(st6);
        studentList.remove(index);

        System.out.println(studentList);
    }
}

class Student{
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;
    public Student(String name, char sex, int age, int course, double avgGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.avgGrade = avgGrade;
        this.course = course;
    }

    @Override
    public String toString(){
        return "Student(" +
                "name = " +name +'\'' +
                ", sex = " + sex +
                ", age = " + age +
                ", course = " + course +
                ", avgGrade = " + avgGrade +')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex && age == student.age && course == student.course && Double.compare(student.avgGrade, avgGrade) == 0 && Objects.equals(name, student.name);
    }
}
