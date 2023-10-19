package Serialization;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) {
        Person people[] = {new Person(1, "Anna"),
                new Person(2, "Tom"), new Person(3, "Bart")};

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))){
            /* 1 способ
            oos.writeInt(people.length); //сообщил кол-во объектов
            for (Person person: people) {
                oos.writeObject(person); //записал поочередно
            }*/

            //2 способ

            oos.writeObject(people);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
