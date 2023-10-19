package Collection.Stack;
//push добавляет элемент на самый верх стека
//pop выводит и удаляет элемент на самом верху списка элемент
//peek выводит элемент на самом верху стека без удаления
import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Илья");
        stack.push("Олег");
        stack.push("Миша");
        stack.push("Катя");
        System.out.println(stack);

        /*while (!stack.isEmpty()) {
            System.out.println(stack.pop());
            System.out.println(stack);
        }*/

        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
