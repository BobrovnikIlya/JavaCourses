package Collection.ArrayList;

import java.util.ArrayList;

//Lesson 3
// add(позиция, значение) - добавление элемента (можно в конкретную позицию)
// get(индекс) - получение элемента по индексу
// set(индекс, элемент) - замена элемента по индексу
// remove(индекс либо элемент) - удаляет элемент по элементу либо индексу
public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Bob");
        arrayList1.add("Mike");
        arrayList1.add("Anna");
        arrayList1.add(1, "Ilya");
        for (String s : arrayList1) {
            System.out.println(s + " ");
        }
        System.out.println();

        arrayList1.set(0, "Masha");
        arrayList1.remove(3);

        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println(arrayList1.get(i));
        }
    }
}


