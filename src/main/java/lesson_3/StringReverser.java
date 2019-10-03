package lesson_3;

import java.util.ArrayDeque;
import java.util.Deque;

public class StringReverser {
    public static void main(String[] args) {
        reverseString("ololosha");
    }

    static MyDeque<Object> queue = new MyDeque<>();

    static public void reverseString(String inputString){
        for (char c :
                inputString.toCharArray()) {
            queue.insertRight(c);
        }
        while (queue.size() != 0){
            System.out.print(queue.removeRight());
        }
    }
}
