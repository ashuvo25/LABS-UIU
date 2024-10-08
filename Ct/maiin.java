import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class maiin {

 


    public static void main(String[] args) {

        Student student1 = new Student("Alice", 102, 3.75);
        Student student2 = new Student("Bob", 101, 3.90);
        Student student3 = new Student("Robin", 104, 3.70);
        Student student4 = new Student("HUD", 105, 3.60);
        Student student5 = new Student("Milissa", 103, 3.65);

        // System.out.println(student1.printDetails());  
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        System.out.println("Before Sort: ");

        for (Student student : studentList) {
            System.out.println(student.toString());
        }


        Collections.sort(studentList, Student.compareById());
        System.out.println("Sorted by ID:");
        for (Student student : studentList) {
            System.out.println(student.toString());
        }

       System.out.println( "Sort BY name : ");
   
   Comparator < Student> comp = new Comparator<Student>() {
    @Override
        public int compare(Student s1, Student s2) {
            return s1.name.compareTo(s2.name);
        }
   };
   
try (BufferedWriter writer = new BufferedWriter(new FileWriter("CT.txt"))) {
            for (Student student : studentList) {
                writer.write(student.toString());
                writer.newLine();
            }
        }
         catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nInfo for student:");
        try (BufferedReader reader = new BufferedReader(new FileReader("CT.txt"))) {
            String info;
            while ((info = reader.readLine()) != null) {
                System.out.println(info); 
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }

   }

    
}
