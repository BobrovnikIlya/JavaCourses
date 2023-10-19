//Lesson 12
public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int [5];
        numbers[0] = 10;

        String[] strings = new String[3];
        strings[0] = "Hello";
        strings[1] = "Bye";
        strings[2] = "Java";

        for (int i = 0; i <strings.length;i++){
            System.out.println(strings[i]);
        }

        System.out.println();
        for (String string: strings) {
            System.out.println(string);
        }

        System.out.println();
        int [] numbers1 = {1, 2, 3};
        int sum = 0;
        for (int number:numbers1){
            sum+=number;
        }
        System.out.println(sum);

        int value = 0;
        String s = null;
    }
}
