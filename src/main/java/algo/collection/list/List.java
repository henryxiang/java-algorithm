package algo.collection.list;

/**
 * This is interface of List ADT
 * @param <T> generic type
 */
public interface List<T> {
    /**
     * Add value to list
     * @param value - value to be added into list
     */
    void add(T value);

    /**
     * Get value from the list at the index
     * @param index - index where the item to be retrieved
     * @return value at the index
     */
    T get(int index);

    /**
     * Change a value in the list at the index
     * @param index
     * @param value
     */
    void put(int index, T value);

    /**
     * Remove the value from the list at the index, and shift the
     * subsequent elements one position forward
     * @param index
     */
    void remove(int index);

    /**
     * Insert a value into the list at the index, and shift the
     * subsequent elements one position backward
     * @param index
     * @param value
     */
    void insert(int index, T value);

    /**
     *
     * @return number of elements in the list
     */
    int size();
}
