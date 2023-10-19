package Collection.ArrayList;

import java.util.ArrayList;

//Lesson 4
// addAll(с позиции, коллекция) - добаляет коллекцию элементов (можно с какой-либо позиции)
// clear() - очиста
// indexOf(элемент) - поиск индекса в колекции по объекту
// lastIndexOf(элемент) - поиск индекса с конца
// size() - размер массива
// isEmpty() - проверка на пустоту (true - пуст)
// contains(элемент) - проверка есть ли такой элемент в коллекции
// toString()
public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Bob");
        arrayList1.add("Mike");
        arrayList1.add("Anna");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("???");
        arrayList1.addAll(1, arrayList2);
        System.out.println(arrayList1);

        System.out.println(arrayList1.indexOf("Anna"));

        arrayList1.clear();
        System.out.println(arrayList1);
        System.out.println(arrayList1.isEmpty());
        System.out.println(arrayList1.contains("Bob"));
    }
}
