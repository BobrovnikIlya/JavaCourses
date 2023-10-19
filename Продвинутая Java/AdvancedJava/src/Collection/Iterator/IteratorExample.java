package Collection.Iterator;
//Lesson 6;
// hasNext() - есть ли следующий
// next() - выбираем следующий
// remove() - удаляем текущий
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Mike");
        arrayList1.add("Elena");
        arrayList1.add("Norma");
        arrayList1.add("Edvard");
        arrayList1.add("Ilya");

        Iterator<String> iterator = arrayList1.iterator();
        while(iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }

        System.out.println(arrayList1);
    }
}
