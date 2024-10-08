import java.util.Comparator;

public class Student {
    
    String name; 
    int id;
    double cgpa;

    public Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }
    public String toString() {
        return "Name:- " + name + ", ID:- " + id + ", CGPA:- " + cgpa;
    }

    public static Comparator<Student> compareById() {
        return new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.id, s2.id);  
            }
        };
    }

    public static Comparator<Student> compareByName() {
        return new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name); 
            }
        };
    }
}
