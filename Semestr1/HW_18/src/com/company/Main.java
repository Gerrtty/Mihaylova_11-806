package com.company;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> ml = new MyLinkedList<>();
        ml.add(6);
        ml.add(7);
        MyLinkedList<Integer> m2 = new MyLinkedList<>();
        m2.add(8);
        m2.add(10);
        ml.addAll(m2, 1);
        for(int i = 0; i < ml.size(); i++){
            System.out.println(ml.get(i));
        }
        System.out.println(ml.contains(10));
    }
}
