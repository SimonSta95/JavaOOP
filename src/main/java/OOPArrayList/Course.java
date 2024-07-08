package OOPArrayList;

public class Course {
    private String name;
    private String instructor;
    private String room;

    public Course() {
        name = "";
        instructor = "";
        room = "";
    }

    public Course(String name, String instructor, String room) {
        this.name = name;
        this.instructor = instructor;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", instructor='" + instructor + '\'' +
                ", room='" + room + '\'';
    }
}
