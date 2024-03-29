package lesson_8;

import java.util.Arrays;

public class LinearProbingHashMap<Key, Value> {
    private int capacity = 7;
    private int size = 0;

    private Key nullableKey = (Key) new Object();

    private Key[] keys = (Key[]) new Object[capacity];
    private Value[] values = (Value[]) new Object[capacity];

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % capacity;
    }

    private boolean isKeyNotNull(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("Key null");
        }
        return true;
    }

    public void put(Key key, Value value) {
        isKeyNotNull(key);
        if (size == capacity - 1) {
            throw new ArrayIndexOutOfBoundsException("size == capacity -1");
        }
        int i;
        for (i = hash(key); keys[i] != null; i = (i + 1) % capacity) {
            if (keys[i].equals(nullableKey)) {
                keys[i] = key;
                values[i] = value;
                return;
            }
            if (keys[i].equals(key)) {
                values[i] = value;
                return;
            }
        }
        keys[i] = key;
        values[i] = value;
        size++;
    }

    public Value get(Key key) {
        isKeyNotNull(key);
        int i;
        for (i = hash(key); keys[i] != null; i = (i + 1) % capacity) {
            if (keys[i].equals(key)) {
                return values[i];
            }
        }
        return null;
    }

    public void delete(Key key) {
        isKeyNotNull(key);
        int i;
        for (i = hash(key); keys[i] != null; i = (i + 1) % capacity) {
            if (keys[i].equals(key)) {
                values[i] = null;
                keys[i] = nullableKey;
            }
        }
        size--;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < capacity; i++) {
                sb.append(keys[i] + "=" + values[i] + ", ");
            sb.append("\n");
        }
        return sb.toString();
    }
}
