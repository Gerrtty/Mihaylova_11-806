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
    public void AddAlll(IntList list, int index) {
       for (int i = 0; i < list.size(); i++){
           this.add(list.get(i), index + i);
       }
    }
    public void add(int e, int index){
       int addd = index;
       if(index >= this.count){
            addd = this.size();
       }
       int[] lastElements = Arrays.copyOfRange(this.elements, addd, this.count);
       while (this.elements.length <= index){
           this.grow();
       }
       this.count = index;
       this.add(e);
       for (int i = 0; i < lastElements.length; ++i) {
           this.add(lastElements[i]);
       }
    }
}
