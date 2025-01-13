package my_list_2;

import java.util.Arrays;

public class MylistTest2<E> {
    int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MylistTest2() {
        elements = new Object[DEFAULT_CAPACITY];
    }

//    public void ensureCapacity(int capacity) {
//
//        elements = new Object[capacity];
//    }

    public void add(int index , E element) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        ensureCapacity(size + 1);
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(get(i) + " ");
        }
        System.out.println();
    }

    public E remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        E removeElement = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = null;
        return removeElement;
    }

    public boolean add(E element) {
        ensureCapacity(size + 1);
        elements[size++] = element;
        return true;
    }

    public int size() {
        return size;
    }

    public MylistTest2<E> clone() {
        MylistTest2<E> clone = new MylistTest2<>();
        clone.size = this.size;
        clone.elements = Arrays.copyOf(this.elements, this.size);
        return clone;
    }

    public boolean contains(E element) {
        return indexOf(element) != 0;
    }

    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public void ensureCapacity( int minCapacity) {
        if (minCapacity > elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
    }

    public E get(int index) {
        if (index >= size || index < 0) throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        return (E) elements[index];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }



}
