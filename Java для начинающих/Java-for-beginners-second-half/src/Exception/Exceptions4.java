package Exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

//Lesson 40
public class Exceptions4 {
    public static void main(String[] args) {
        try {
            run();
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }
    public static void run() throws IOException, ParseException {

    }
}
