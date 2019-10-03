package lesson_3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

public class DequeTest {
    MyDeque<Integer> myDeque;
    @Before
    public void createAndFillDeque(){
        myDeque = new MyDeque<>(7);
        myDeque.insertRight(4);
        myDeque.insertLeft(3);
        myDeque.insertRight(5);
        myDeque.insertLeft(2);
        myDeque.insertRight(6);
        myDeque.insertLeft(1);

    }
    @Test
    public void testLeftAccess(){
        int[] ints = new int[myDeque.size()];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = myDeque.removeLeft();
        }
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6},ints);
    }
    @Test
    public void testRightAccess(){
        int[] ints = new int[myDeque.size()];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = myDeque.removeRight();
        }
        Assert.assertArrayEquals(new int[]{6,5,4,3,2,1},ints);
    }

    @Test(expected = StackOverflowError.class)
    public void overflowTest(){
        for (int i = 0; i < 10; i++) {
            myDeque.insertRight(i);
        }
    }

    @Test(expected = EmptyStackException.class)
    public void emptyStackTest(){
        for (int i = 0; i < 10; i++) {
            myDeque.removeRight();
        }
    }
}
