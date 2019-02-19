import java.util.Comparator;

public class ListOfStudents{
    Student[] list;
    static int SIZE = 10;
    int n = 0;
    private Comparator<Student> comparator;


    public ListOfStudents(){
        list = new Student[SIZE];
    }

    public ListOfStudents(Comparator<Student> comparator){
        this();
        this.comparator = comparator;
    }

    public void add(Student student){
        if(n == SIZE){
            throw new IllegalArgumentException("PlayList is overflow");
        }
        int c = 0;
        if(comparator == null){
            while (c < n && list[c].compareTo(student) <= 0){
                c++;
            }
        }
        else{
            while ((c < n && (comparator.compare(list[c], student)) <= 0)){
                c++;
            }
        }
        for (int i = n - 1; i >= c; i--) {
            list[i + 1] = list[i];
        }
        list[c] = student;

        n++;
    }

    public void show(){
        for(int i = 0; i < n; i++){
            System.out.println(list[i]);
        }
    }
}