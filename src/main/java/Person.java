public class Person {
    String name;
    int age;
    char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introducePerson(){
        System.out.println("Hello, I am " + name + " and " + age + " years old.");
    }
}
