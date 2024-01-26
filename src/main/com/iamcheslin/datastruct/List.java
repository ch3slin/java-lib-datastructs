package main.com.iamcheslin.datastruct;

public interface List <T>{
    // Appends the specified element to the end of this list (optional operation).

    void add(T data);

    // Inserts the specified element at the specified position in this list (optional operation).
    void add(int index, T data);
    // Returns true if this list contains the specified element.
    boolean contains(T data);
    // Removes all the elements from this list (optional operation).
    void clear();
    // Returns the element at the specified position in this list.
    T get(int index);
    // Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element
    int indexOf(T data);
    // Returns true if this list contains no elements
    boolean isEmpty();
    //Removes the element at the specified position in this list (optional operation).
    void remove(int index);
    // Replaces the element at the specified position in this list with the specified element (optional operation).
    T set(int index, T data);
    // Returns the number of elements in this list.
    int size();

}
