package com.gulraiz.generics;

import java.util.Arrays;

public class CustomGenericsArrayList<T> {

    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericsArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T number) {
        if (isFull()) {
            resize();
        }
        data[size++] = number;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return (data.length == size);
    }

    public T remove() {
        T remove = (T)(data[size--]);
        return remove;
    }

    public T get(int index) {
        return (T)(data[index]);
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGenericsArrayList<Integer> list1 = new CustomGenericsArrayList<Integer>();
        for (int i = 0; i < 12; i++) {
            list1.add(i);
        }
        System.out.println(list1);
    }
}
