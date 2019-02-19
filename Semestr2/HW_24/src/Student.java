public class Student implements Comparable<Student>{
    int age;
    String name;
    int passportNumber;
    int numberOfGroup;
    int course;

    public Student(String name, int age, int numberOfGroup, int course, int passportNumber){
        this.name = name;
        this.age = age;
        this.passportNumber = passportNumber;
        this.numberOfGroup = numberOfGroup;
        this.course = course;
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

    @Override
    public int compareTo(Student s) {
        return this.age - s.age;
    }

    @Override
    public String toString(){
        return "This student name is " + name + " " +  age + " years old," +
                " he/she learning in " + numberOfGroup + " group" + " on " + course + "th" + " course";
    }
}