package com.company;

public interface IntList {
    void add(int e);

    int get(int index);

    int size();

    boolean contains(int value);

    void remove(int index);

    void sort();

    int[] toArray();

    void addAll(IntList list); //Добавление элементов в конец

    void addAlll(IntList list, int index);
}
