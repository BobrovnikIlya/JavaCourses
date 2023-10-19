package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Lesson 2
public class ArrayListEx {
    public static void main(String[] args) {
        //CollectionPackage.ArrayList<String> arrayList1 = new CollectionPackage.ArrayList<String>();
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Bob");
        arrayList1.add("Mike");
        arrayList1.add("Anna");
        System.out.println(arrayList1);

        List<String> arrayList2 = new ArrayList<>(200);
        arrayList2.add("Bob");
        arrayList2.add("Mike");
        System.out.println(arrayList2);

        ArrayList<String> arrayList3 = new ArrayList<>(arrayList1);
        System.out.println(arrayList3);

/////////////////////////////////////////// Повтор //////////////////////////////////////

        arrayList1.add(1,"Bobka");
        System.out.println(arrayList1.get(1));
        arrayList1.set(1, "Nike");
        arrayList1.remove(1);

        arrayList1.size();
        arrayList1.indexOf("Mike");
        arrayList1.lastIndexOf("Anna");
        arrayList1.isEmpty();
        arrayList1.contains("Mike");
        arrayList1.toString();
        //arrayList1.clear();



        String [] strings = new String[5];
        strings[1] = "Okay";
        strings[0] = "Nice";
        List<String> arrayList5 = Arrays.asList(strings);



        arrayList1.addAll(1, arrayList5);
        arrayList1.removeAll(arrayList5);
        arrayList1.retainAll(arrayList5);
        arrayList1.containsAll(arrayList5);

        List<String> myList = arrayList1.subList(1,4);
        String [] array = arrayList1.toArray(new String[0]);

        List.of();
        List.copyOf(arrayList1);
//////////////////////////////////////////////////////////////////////////////////////////////////////
    }
}
