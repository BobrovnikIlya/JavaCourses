package Exception;

import java.io.IOException;
import java.util.Scanner;

//Lesson 38
public class Exceptions2 {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        while(true){
            int x = Integer.parseInt(scanner.nextLine());

            if(x!=0){
                    throw new ScannerException("User input not 0");
            }
        }
    }
}
