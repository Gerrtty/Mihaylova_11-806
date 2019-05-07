package task02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ship {
    private static String name;
    private static int number;
    private static int weight;

    public void setName(String name){
        this.name = name;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }


}


class Arr{
    List<Ship> l;

    public Arr(){
        l = new ArrayList<>();
    }

    public void add(Ship ship){
        l.add(ship);
    }


    public ArrayList top10(int n, Comparator<Ship> comparator){
        if(n > l.size()){
            throw new IllegalArgumentException("В массиве нет такого количества элементов");
        }
        l.sort(comparator);
        ArrayList<Ship> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(l.get(i));
        }
        return al;
    }
}