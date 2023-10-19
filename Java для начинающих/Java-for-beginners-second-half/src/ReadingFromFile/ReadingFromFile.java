package ReadingFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Lesson 36
public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = "testFile";

        File file = new File(path);


        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
    }
}
