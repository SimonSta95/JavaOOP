package OOPArrayList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //1
        ArrayList<Student> list = new ArrayList<>();
        Student JohnDoe = new Student("John", "Doe", 1998);
        Student JaneDoe = new Student("Jane", "Doe", 1997);
        Student MaxMustermann = new Student("Max", "Mustermann", 1996);

        list.add(JohnDoe);
        list.add(JaneDoe);
        list.add(MaxMustermann);

        //2
        School school = new School();
        school.addStudent(JohnDoe);
        school.addStudent(JaneDoe);
        school.addStudent(MaxMustermann);
        school.printStudents();
        System.out.println(school + "\n");

        //3
        school.getStudent(1998);
        school.removeStudent(MaxMustermann);
        school.printStudents();

        //Bonus 1
        Course maths = new Course("Maths", "Dr. Mothagy", "A01");
        JohnDoe.addCourse(maths);
        school.getCourses(1998);
    }
}
