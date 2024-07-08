package OOPArrayList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        School mySchool = new School();
        mySchool.addStudent(new Student("John", "Doe", 1998));
        mySchool.addStudent(new Student("Jane", "Doe", 1997));
        mySchool.addStudent(new Student("Max", "Mustermann", 1996));
        mySchool.printStudents();
        System.out.println(mySchool + "\n");

        //3
        mySchool.getStudent(1998);
        mySchool.removeStudent(new Student("Max", "Mustermann", 1996));
        mySchool.printStudents();

        //Bonus 1
        Course maths = new Course("Maths", "Dr. Mothagy", "A01");
        Student searchStudent = mySchool.getStudent(1998);
        if (searchStudent != null) {
            System.out.println("Student found!: " + searchStudent);
            searchStudent.addCourse(maths);
            mySchool.getCourses(1998);
        }

    }
}
