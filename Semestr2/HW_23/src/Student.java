public class Student {
    int age;
    String name;
    int passportNumber;

    public Student(int age, String name, int passportNumber){
        this.age = age;
        this.name = name;
        this.passportNumber = passportNumber;
    }

    public boolean equals(Object obj){
        if(!(obj instanceof Student)){
            return false;
        }
        if(this == obj){
            return true;
        }
        Student s = (Student) obj;
        return this.passportNumber == s.passportNumber;
    }

    @Override
    public int hashCode(){
        int result = 1;
        result = result * 31 + passportNumber;
        result = result * 31 + name.hashCode();
        return result;
    }
}
