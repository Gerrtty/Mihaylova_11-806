import java.lang.reflect.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        getMany(Student.class, "John" , 18).stream().forEach(s -> System.out.println(s));
        System.out.println();
        Integer age = 19;
        getMany(Student.class, "Kris", age).stream().forEach(s -> System.out.println(s));
    }

    public static <T> List <T> getMany(Class<T> c, Object... params) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        int count = 10, length = params.length;
        List<T> l = new ArrayList<>();
        Class[] arr = new Class[length];
        for (int i = 0; i < length; i++) {
            arr[i] = params[i].getClass();
        }
        try {
            Constructor constructor = c.getConstructor(arr);
        }
        catch (NoSuchMethodException e){
            for (int i = 0; i < length; i++) {
                if(params[i].getClass() == Integer.class){
                    arr[i] = int.class;
                }
                if(params[i].getClass() == Double.class){
                    arr[i] = double.class;
                }
                if(params[i].getClass() == Long.class){
                    arr[i] = long.class;
                }
                if(params[i].getClass() == Boolean.class){
                    arr[i] = boolean.class;
                }
                if(params[i].getClass() == Character.class){
                    arr[i] = char.class;
                }
            }
        }
        try {
            Constructor constructor = c.getConstructor(arr);
            for (int i = 0; i < count; i++) {
                T o = (T) constructor.newInstance(params);
                l.add(o);
            }
        }
        catch (NoSuchMethodException e){
            throw new IllegalAccessException();
        }
        return l;
    }
}
