import java.lang.reflect.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        getMany(Student.class, "John" , 18).stream().forEach(s -> System.out.println(s));

        System.out.println();

        getMany(Student.class).stream().forEach(s -> System.out.println(s));
    }

    public static <T> List <T> getMany(Class<T> c, Object... params) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        int count = 10, length = params.length;
        List<T> l = new ArrayList<>();
        Class[] arr = new Class[length];
        for (int i = 0; i < length; i++) {
            arr[i] = params[i].getClass();
        }
        Constructor constructor = c.getConstructor(arr);
        for (int i = 0; i < count; i++) {
            T o = (T) constructor.newInstance(params);
            l.add(o);
        }
        return l;
    }
}
