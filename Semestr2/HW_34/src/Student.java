public class Student {
    private Integer age;
    private String name;
    private int a;
    private Integer A;

    public Student(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public Student(){}

    public String toString(){
        return "Student " + name + " is " + age + " years old";
    }
}
