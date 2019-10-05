package lesson_4;

public class MyLinkedDeque<T> {
    private MyLinkedList<T> deque = new MyLinkedList<>();

    public void pushLeft(T value) {
        deque.insertFirst(value);
    }

    public void pushRight(T value) {
        deque.insertLast(value);
    }

    public T popLeft() {
        return deque.removeFirst();
    }

    public T popRight() {
        return deque.removeLast();
    }

    public T peekLeft() {
        return deque.getFirst();
    }

    public T peekRight() {
        return deque.getLast();
    }

    public int size() {
        return deque.size();
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }
}
