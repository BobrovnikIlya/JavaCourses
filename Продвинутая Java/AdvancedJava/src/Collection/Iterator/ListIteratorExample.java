package Collection.Iterator;
//Lesson 8
// toCharArray - преобразование из string в char
// hasNext, next
// hasPrevious, previous

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();

        for (char ch: s.toCharArray()) {
            list.add(ch);
        }

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(s.length());
        boolean isPalindrome = true;
        while(iterator.hasNext() && reverseIterator.hasPrevious()){
            if(iterator.next() != reverseIterator.previous()){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("NOT Palindrome");
        }
    }
}
