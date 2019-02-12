package com.company;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        GenericArrayList<String> l = new GenericArrayList<>();
        l.add("abc");
        l.add("cde");
        l.add("qwerty");
        l.remove(0);
        System.out.println(l.contains("abc"));


        Iterator<String> iter = l.iterator();

        /*while (iter.hasNext()) {
            String str = iter.next();
        }

        for (String str : l) {
            System.out.println(str.toUpperCase());
        }*/

    }

}