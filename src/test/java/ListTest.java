import lesson2.MyArraylist;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class ListTest {
    long startTime;
    long finishTime;
    public MyArraylist<Integer> mal;

    @Before
    public void createAndFillArray() {
        mal = new MyArraylist<>();
        Random random = new Random();

        for (int i = 0; i < 10000; i++) {
            mal.add(random.nextInt(100));
        }

    }

    @Test
    public void sortSelectionTest() {
        startTime = System.currentTimeMillis();
        mal.selectionSort();
        finishTime = System.currentTimeMillis();
        System.out.println("Selection sort: " + (finishTime - startTime));
    }

    @Test
    public void sortInsertionTest() {
        startTime = System.currentTimeMillis();
        mal.insertionSort();
        finishTime = System.currentTimeMillis();
        System.out.println("Insertion sort : " + (finishTime - startTime));
    }

    @Test
    public void BubbleSortTest() {
        startTime = System.currentTimeMillis();
        mal.bubbleSort();
        finishTime = System.currentTimeMillis();
        System.out.println("Bubble sort : " + (finishTime - startTime));
    }
}
