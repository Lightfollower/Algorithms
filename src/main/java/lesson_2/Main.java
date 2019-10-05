package lesson_2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random= new Random();
        MyArraylist<Integer> mal = new MyArraylist<>();

//        mal.add(5);
//        mal.add(6);
//        mal.add(7);
//
//        mal.add(2,88);

//        mal.remove(5);

        for (int i = 0; i < 100000 ; i++) {
            mal.add(random.nextInt(100));
        }

//        System.out.println(mal);
        long startTime;
        long finishTime;

        startTime = System.currentTimeMillis();
        mal.selectionSort();
        finishTime = System.currentTimeMillis();
        System.out.println("Selection sort: " + (finishTime - startTime));

        startTime = System.currentTimeMillis();
        mal.insertionSort();
        finishTime = System.currentTimeMillis();
        System.out.println("Insertion sort : " + (finishTime - startTime));

        startTime = System.currentTimeMillis();
        mal.bubbleSort();
        finishTime = System.currentTimeMillis();
        System.out.println("Bubble sort : " + (finishTime - startTime));

//        mal.bubbleSort(Comparator.naturalOrder());
//        mal.bubbleSort(Comparator.reverseOrder());

//        System.out.println(mal);









//        MySortedArrayList<Integer> msal = new MySortedArrayList<>();
//        msal.add(7);
//        msal.add(9);
//        msal.add(3);
//        msal.add(5);
//
//        System.out.println(msal);
//        System.out.println(msal.binaryFind(7));

    }
}
