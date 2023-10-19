package Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

// removeAll(коллекция) - удаляет все совпадения с указаной коллекцией
// retainAll(коллекция) - обратный прошлому и удаляет все кроме совпадений
// containsAll(коллекция) - содержит ли коллекция все объекты указанной
// subList(левая граница, правая граница) - возвращает отрывок коллекции
// toArray() - получаем массив типа object
// toArray(тип массива) - получаем массив заданого типа

// JDK>8
// List.of(E...elements)->List<E> - создание коллекции с указанием элементов в скобказх и не изменяется
// List.copyOf(Collection <E> c) ->List<E> - создание колекции копируя другую и не изменяется
public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Bob");
        arrayList1.add("Mike");
        arrayList1.add("Anna");
        arrayList1.add("Ilya");

        List<Integer> list1 = List.of(3,8,13);
        System.out.println(list1);

        List<String> list2 = List.copyOf(arrayList1);
        System.out.println(list2);

        /*Object[] array = arrayList1.toArray();
        String[] array2 = arrayList1.toArray(new String[0]);
        System.out.println(array2);*/

        /*List<String> myList = arrayList1.subList(1,3); //представление arrayList
        System.out.println(myList);
        myList.add("Fedor");
        System.out.println(arrayList1);*/


        /*CollectionPackage.ArrayList<String> arrayList2 = new CollectionPackage.ArrayList<>();
        arrayList2.add("Bob");
        arrayList2.add("Anna");
        arrayList2.add("Igor");*/

        //arrayList1.removeAll(arrayList2);
        //System.out.println(arrayList1);

        //System.out.println(arrayList1.containsAll(arrayList2));
    }
}
