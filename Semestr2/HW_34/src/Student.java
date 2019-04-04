public class Student {
    private int age;
    private String name;

    public Student(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public Student(){}

    public String toString(){
        return "Student " + name + " is " + age + " years old";
    }
}
