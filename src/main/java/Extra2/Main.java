package Extra2;

public class Main {

    public static void main(String[] args) {

        Animal affe = new Animal("affe");
        Animal hund = new Animal("hund");
        Animal elefant = new Animal("elefant");

        AnimalList list = new AnimalList();
        list.add(affe);
        list.add(hund);
        list.add(elefant);

        System.out.println(list);
    }



}
