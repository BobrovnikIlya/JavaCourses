package Cast;
//Lesson 30
public class Test {
    public static void main(String[] args) {
        int a = 123;

        long l = a;//неявное
        int x = (int)l; // явное
        System.out.println(x);

        double d = a;
        int y = (int)x;
        System.out.println(y);
    }
}
