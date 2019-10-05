package lesson_4;

import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> mll = new MyLinkedList<>();

        mll.insertFirst("Katia");
        mll.insertFirst("Maria");
        mll.insertFirst("Lyba");

//        System.out.println(mll);

        mll.insertLast("Petia");
//        System.out.println(mll);

//        System.out.println(mll.removeFirst());
//        System.out.println(mll);
//        System.out.println(mll.removeLast());
//        System.out.println(mll);


        mll.insert("Vasia", 1);
//        System.out.println(mll);

        for (String s : mll) {
            System.out.print(s + " : ");
        }

        System.out.println();
        ListIterator<String> iterator = (ListIterator)mll.iterator();

        System.out.println(iterator.next());
        iterator.remove();

        System.out.println(iterator.next());
        iterator.add("ololosha");
        iterator.remove();
        System.out.println(iterator.next());

        iterator.next() ;
//        iterator.remove();

        for (String s : mll) {
            System.out.print(s + " : ");
        }

//        MyLinkedList<Integer> stack = new MyLinkedList<>();
        MyLinkedStack<Integer> stack = new MyLinkedStack<>();


//        System.out.println(mll.remove("Petia"));
//        System.out.println(mll);
//        System.out.println(mll.remove("Katia"));
//        System.out.println(mll);
//
//        System.out.println(mll.contains("Katia"));


    }
}
