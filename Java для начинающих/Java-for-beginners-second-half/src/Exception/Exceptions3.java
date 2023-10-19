package Exception;

import java.io.File;
import java.util.Scanner;

//Lesson 39
//Checked Exception (Compile time exception)
//Unchecked (Runtime exception) = ошибка в работе программы
public class Exceptions3 {
    public static void main(String[] args) {
        //int a = 1/0;

        /*String name = null;
        name.length();*/

        try {
            int[] arr = new int[2];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Вышли за границы!");
        }
    }
}
