package lesson3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class StringReverser {
    public static void main(String[] args) {
        reverseString("ololosha");
    }

    static Deque<Object> queue = new ArrayDeque<>();

    static public void reverseString(String inputString){
        for (char c :
                inputString.toCharArray()) {
            queue.push(c);
        }
        while (queue.size() != 0){
            System.out.print(queue.poll());
        }
    }
}
