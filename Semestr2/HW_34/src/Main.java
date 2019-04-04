import java.lang.reflect.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        getMany(Student.class, "John" , 18).stream().forEach(s -> System.out.println(s));
        System.out.println();
        Integer age = 19;
        getMany(Student.class, "Kris", age).stream().forEach(s -> System.out.println(s));
    }

    public static <T> List<T> getMany(Class<T> c, Object... params) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        int count = 10, length = params.length;
        Class[] classes = new Class[length];
        for (int i = 0; i < length; i++) {
            classes[i] = params[i].getClass();
        }
        Class[] arr = new Class[length];
        Constructor[] constructors = c.getConstructors();
        for(Constructor constructor : constructors){
            Class[] paramTypes = constructor.getParameterTypes();
            if(paramTypes.length == classes.length){
                for (int i = 0; i < length; i++){
                    if(classes[i].equals(paramTypes[i])){
                        arr[i] = paramTypes[i];
                    }
                    else if(classes[i].equals(Integer.class)){
                        arr[i] = int.class;
                    }
                    else if(classes[i].equals(Boolean.class)){
                        arr[i] = boolean.class;
                    }
                    else if(classes[i].equals(Character.class)){
                        arr[i] = char.class;
                    }
                    else if(classes[i].equals(Double.class)){
                        arr[i] = double.class;
                    }
                    else {
                        continue;
                    }
                }
                break;
            }
            else continue;
        }
        List<T> l = new ArrayList<>();
        try {
            Constructor constructor = c.getConstructor(arr);
            for (int i = 0; i < count; i++) {
                T o = (T) constructor.newInstance(params);
                l.add(o);
            }
        }
        catch (NoSuchMethodException e){
            throw new IllegalArgumentException("В классе не существует конструкторов, принимающих заданные параметры");
        }
        return l;
    }
}
