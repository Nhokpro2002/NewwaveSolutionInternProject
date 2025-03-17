/*
package hus.datatype;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StudentManager {

    public static void main(String[] args) {
        Student student1 = new Student("A",  (byte) 1);
        Student student2 = new Student("B",  (byte) 2);
        Student student3 = new Student("C",  (byte) 3);
        Student student4 = new Student("D",  (byte) 4);

        */
/*Student[] students = new Student[4];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        sort(students);
        showStudentList(students);*//*


        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);
        sort(studentArrayList);
        showStudentList(studentArrayList);

    }

    public static void showStudentList(Student[] students) {
        for (Student student: students) {
            System.out.println(student);
        }
    }

    public static Student search(Student[] students) {
        if (students == null) {
            return null;
        }
        Student maxScoreStudent = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getScore() > maxScoreStudent.getScore()) {
                maxScoreStudent = students[i];
            }
        }
        return maxScoreStudent;
    }

    public static void sort(Student[] students) {
        if (students == null) {
            return;
        }

        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].getScore() < students[j + 1].getScore()) {
                    Student student = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = student;
                }
            }
        }
    }

    public static void showStudentList(ArrayList<Student> students) {
        for (Student student: students) {
            System.out.println(student);
        }
    }

    public static Student search(ArrayList<Student> students) {
        if (students == null) {
            return null;
        }

        Student initStudent = students.get(0);
        for (Student student: students) {
            if (initStudent.getScore() < student.getScore()) {
                initStudent = student;
            }
        }
        return initStudent;
    }

    public static void sort(ArrayList<Student> students) {
        if (students == null) {
            return;
        }

        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = 0; j < students.size() - i - 1; j++) {
                if (students.get(j).getScore() < students.get(j + 1).getScore()) {
                    Student student = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, student);
                }
            }
        }
    }

}
*/
