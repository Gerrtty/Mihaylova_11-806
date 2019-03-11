package com.company;

public class Main {

    public static void main(String[] args) {
        IntArrayList arr = new IntArrayList();
        arr.add(12);
        arr.add(6);
        arr.add(10);
        arr.add(5);

        IntArrayList arr2 = new IntArrayList();

        arr2.add(1);
        arr2.add(2);
        arr2.add(3);

        arr.addAll(arr2, 2);
        //arr.remove(2);

        for (int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }

    }
}
