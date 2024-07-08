package OOPArrayList;

import java.util.ArrayList;

public class School {
    private ArrayList<Student> students;

    public School() {
        students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        if(!students.contains(student)) {
            students.add(student);
        }
    }

    public void printStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public Student getStudent(int id) {
        for (Student student : students) {
            if(student.getStudentId() == id){
                return student;
            }
        }
        return null;
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void getCourses(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                System.out.println(student.getCourses());
            }
        }
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }
}
