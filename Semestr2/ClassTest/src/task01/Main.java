package task01;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList a = func(s -> s.charAt(0) == 'a');
        a.stream().forEach(s -> System.out.println(s));
    }

    public static ArrayList func(Predicate<String> p) throws IOException {
        File f = new File("words.txt");
        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(f);
        while (sc.hasNext()){
            String str = sc.next();
            if(p.test(str)){
                if(map.get(str) != null){
                    map.put(str, map.get(str) + 1);
                }
                else map.put(str, 1);
            }
        }
        ArrayList<String> l = new ArrayList();
        map.entrySet().stream().sorted(new Comparator<HashMap.Entry<String, Integer>>() {
            @Override
            public int compare(HashMap.Entry<String, Integer> o1, HashMap.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        }).forEach((s) -> l.add(s.getKey()));
        return l;
    }
}
