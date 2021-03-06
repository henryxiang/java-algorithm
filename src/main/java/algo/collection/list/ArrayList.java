package algo.collection.list;

public class ArrayList<T> implements List<T> {
    private final int DEFAULT_CAPACITY = 100;
    protected T[] data;
    private int size;

    public ArrayList() {
        data = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public ArrayList(int capacity) {
        data = (T[]) new Object[capacity];
    }

    public void add(T value) {
        if (size >= data.length) resize(data.length*2);
        data[size++] = value;
    }

    public T get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Invalid index: " + index);
        return data[index];
    }

    public void put(int index, T value) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Invalid index: " + index);
        data[index] = value;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Invalid index: " + index);
        int start = index + 1;
        int end = size - 1;
        for (int i = start; i <= end; i++) {
            data[i-1] = data[i];
        }
        data[end] = null;
        size--;
        if (size < data.length/4) resize(data.length/2);
    }

    public void insert(int index, T value) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Invalid index: " + index);
        if (size >= data.length) resize(data.length*2);
        int start = index;
        int end = size - 1;
        for (int i = end; i >= start ; i--) {
            data[i+1] = data[i];
        }
        data[index] = value;
        size++;
    }

    public int size() {
        return size;
    }

    private void resize(int length) {
//        data = Arrays.copyOf(data, length);
        T[] newData = (T[]) new Object[length];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }
}
