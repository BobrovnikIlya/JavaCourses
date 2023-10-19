package Serialization;
//Lesson 45-47
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))){
            /* 1 способ
            int personCount = ois.readInt(); //узнал кол-во объектов

            Person[] people = new Person[personCount];

            for (int i = 0; i<personCount; i++){
                people[i] = (Person) ois.readObject(); //присвоил поочередно
            }*/

            // 2 способ

            Person[] people = (Person[]) ois.readObject();

            System.out.println(Arrays.toString(people)); //вывел весь массив
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
