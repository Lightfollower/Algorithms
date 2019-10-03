package lesson3;

import java.util.EmptyStackException;

public class MyDeque<Item> {
    private Item[] list;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private int begin = list.length - 1;
    private int end = 0;
    //0 1 2 3 4
    //b
    //  e
    //7

    public MyDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("bad size " + capacity);
        }
        list = (Item[]) new Object[capacity];
    }

    public MyDeque() {
        list = (Item[]) new Object[DEFAULT_CAPACITY];
    }

    public void insert(Item item) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }

    public void insertFromOtherEnd(Item item) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        size++;
        list[begin] = item;
        begin = previousIndex(end);
    }

    public Item remove() {
        Item value = peekFront();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return value;
    }

    public Item removeFromOtherEnd() {
        Item value = peekFront();
        size--;
        list[end] = null;
        end = previousIndex(begin);
        return value;
    }

    private Item peekFront() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[begin];
    }

    private Item peekBack() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[end];
    }

    private Item peekRear() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[end];
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    private int previousIndex(int index) {
        if (index == 1)
            return list.length - 1;
        return (index - 1);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }
}