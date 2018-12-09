package com.company;

import java.util.Arrays;

public  class IntArrayList implements IntList {
   private int[] elements;
   private static final  int DEFOULT_CAMPACITY = 10;
   private int count = 0;
   private static final double EXTENTION_COEF = 1.5;

   public IntArrayList(){
       this.elements = new int[DEFOULT_CAMPACITY];
   }

    @Override
    public void add(int e) {
       if(count == elements.length){
           grow();
       }
       elements[count++] = e;
    }

    private void grow(){
       int oldCapacity = elements.length;
       int newCapacity  = (int) (oldCapacity * EXTENTION_COEF);
       int newElements[] = new int[newCapacity];
       for(int i = 0; i < oldCapacity; i++){
           newElements[i] = elements[i];
       }
       elements = newElements;
    }

    @Override
    public int get(int index) {
       if(index < 0 || index >= count){
           throw new IllegalArgumentException("Index " + index + " incorrect");
       }
       return elements[index];
    }

    @Override
    public boolean contains(int value) {
       boolean b = false;
       for(int i = 0; i < this.count; i++){
           if(this.get(i) == value){
               b = true;
           }
       }
       return b;
    }

    @Override
    public int size() {
        return this.count;
    }

    @Override
    public void remove(int index) {
        int[] newArr = new int[elements.length - 1];
        for (int i = 0; i < index; i++){
            newArr[i] = elements[i];
        }
        for (int i = index + 1; i < elements.length; i++){
            newArr[i - 1] = elements[i];
        }
        elements = newArr;
        this.count--;
    }

    @Override
    public int[] toArray() {
       int[] newMass = new int[elements.length];
       for(int i = 0; i < elements.length; i++){
           newMass[i] = elements[i];
       }
       return newMass;
    }

    @Override
    public void sort() {
        for (int i = 0; i < this.size(); i++) {
            for (int j = 0; j < this.size() - 1 - i; j++) {
                if (this.elements[j] > this.elements[j + 1]) {
                    int buf = this.elements[j];
                    this.elements[j] = this.elements[j + 1];
                    this.elements[j + 1] = buf;
                }
            }
        }
    }

    @Override
    public void addAll(IntList list) {
        for(int i = 0; i < list.size(); i++){
            this.add(list.get(i));
        }
    }

    @Override
    public void addAlll(IntList list, int index) {
        int[] arr3 = new int[elements.length + list.size()];
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
        this.count = arr3.length;
   }
}
