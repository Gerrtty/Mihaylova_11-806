import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Veronika", 18, 11705, 2, 686929797);
        Student s2 = new Student("Dmitriy", 17, 12309, 1, 676867676);
        Student s3 = new Student("Kamil", 19, 10703, 3, 667839872);

        Comparator<Student> comparator = new ByNameComparator();

        //По номеру курса
        Comparator<Student> c = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.course - o2.course;
            }
        };

        //По номеру группы
        Comparator<Student> compar = (o1, o2) -> {
            return o1.numberOfGroup - o2.numberOfGroup;
        };

        ListOfStudents l = new ListOfStudents(compar);

        l.add(s);
        l.add(s2);
        l.add(s3);
        l.show();
    }
}
