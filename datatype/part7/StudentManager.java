package hus.datatype.part7;


import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    public static void main(String[] args) {
        Student student1 = new Student("A",4);
        Student student2 = new Student("B",6.5);
        Student student3 = new Student("C",9);
        Student student4 = new Student("D",6);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        for (Student student: studentList) {
            student.classify(student.getScore());
            System.out.println(student);
        }

    }
}
