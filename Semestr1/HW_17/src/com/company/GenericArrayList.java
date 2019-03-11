package com.company;

import java.util.Iterator;

public class GenericArrayList<T> implements Iterable<T> {
    private T[] elements;
    private int count = 0;
    private static final  int DEFOULT_CAMPACITY = 10;
    private static final double EXTENTION_COEF = 1.5;

    public GenericArrayList() {
        elements = (T[]) new Object[DEFOULT_CAMPACITY];
    }

    public void add(T e) {
        elements[count++] = e;
    }

    private void grow(){
        int oldCapacity = elements.length;
        int newCapacity  = (int) (oldCapacity * EXTENTION_COEF);
        T newElements[] = (T[]) new Object[newCapacity];
        for(int i = 0; i < oldCapacity; i++){
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    public T get(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("Index: " + index + " is not valid");
        }
        return elements[index];
    }

    //число элементов в списке
    int size() {
        return this.count;
    }

    //есть ли в списке такой элемент
    boolean contains(T value) {
        for(int i = 0; i < this.count; i++){
            if(elements[i] == value){
                return true;
            }
        }
        return false;
    }

    //удаление элемента по индекс (со смещением элементов влево)
    void remove(int index) {
        T[] newArr = (T[]) new Object[elements.length - 1];
        for (int i = 0; i < index; i++){
            newArr[i] = (elements[i]);
        }
        for (int i = index + 1; i < elements.length; i++){
            newArr[i - 1] = elements[i];
        }
        elements = newArr;
        this.count--;
    }

    //возвращает все элементы из списка в виде массива
    T[] toArray() {
        T arrayForList[] = (T[]) new Object[this.size()];
        for (int i = 0; i < this.size(); i++){
            arrayForList[i] = this.get(i);
        }
        return arrayForList;
    }

    //добавление всех элементов из списка list в данный список(в конец)
    void addAll(GenericArrayList<T> list) {
        for(int i = 0; i < list.size(); i++){
            this.add(list.get(i));
        }
    }

    //добавление всех элементов из списка list в данный список
    //начиная с позиции index
    void addAll(GenericArrayList<T> list, int index) {
		T[] arr3 = (T[]) new Object[elements.length + list.size()];
        for (int i = 0; i < index + 1; i++){
            arr3[i] = elements[i];
        }
        for (int i = index + 1, j = 0; j < list.size(); i++, j++){
            arr3[i] = list.get(j);
        }
        for (int i = list.size() + index + 1, j = index + 1; i < arr3.length; i++, j++){
            arr3[i] = elements[j];
        }
        elements = arr3;
        this.count = this.size() + list.size();
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIter();
    }

    class MyIter implements Iterator<T> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }

        @Override
        public T next() {
            return elements[currentIndex++];
        }

    }

}