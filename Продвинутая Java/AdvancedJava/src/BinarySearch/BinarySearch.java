package BinarySearch;//Lesson 9
//Collections - не путать с интерфейсом Collection
//Методы
//sort(list) - сортирока
//binarySearch(list, искомое) - бинарный поиск
//reverse(list) - переворот значений(первые в конец, а последние в начало)
//shuffle(list) - перемешать
import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Employee emp1 = new Employee(100, "Zaur", 1234);
        Employee emp2 = new Employee(15, "Ivan", 6432);
        Employee emp3 = new Employee(123, "Petr", 1414);
        Employee emp4 = new Employee(15, "Mariya", 54845);
        Employee emp5 = new Employee(182, "Kolya", 9964);
        Employee emp6 = new Employee(15, "Sasha", 3473);
        Employee emp7 = new Employee(250, "Elena", 3473);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);
        System.out.println(employeeList);

        Collections.sort(employeeList);
        System.out.println(employeeList);

        int index2 = Collections.binarySearch(employeeList, new Employee(182, "Kolya", 9964));
        System.out.println(index2);

        Collections.reverse(employeeList);//реверс
        System.out.println(employeeList);

        Collections.shuffle(employeeList);//перемешка
        System.out.println(employeeList);



        /*int [] array = {-3,8,12,-8,0,5, 10, 1,150,-30,19};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index3 = Arrays.binarySearch(array,150);
        System.out.println(index3);*/
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{"+
                "id = " + id +
                ", name = " +name+'\''+
                ", salary = " +salary + '}';
    }
    public int compareTo(Employee anotherEmp){
        int result = this.id - anotherEmp.id;
        if(result == 0){
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
    }
}
