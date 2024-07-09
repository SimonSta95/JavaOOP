package OOPRecords;

public class Main {
    public static void main(String[] args) {
        Owner  Simon = new Owner("Simon", 29, "Köln");
        Species Primat = new Species("Primat", 500);
        Species Reptil = new Species("Reptil", 1500);

        Animal Affe = new Animal(1,"Affe",Primat,3,Simon);
        Animal Krokodil = new Animal(2,"Krokodil",Reptil,5, Simon);
        Animal Krokodil2 = new Animal(3,"Krokodil",Reptil,5, Simon);

        System.out.println(Affe);
        System.out.println(Krokodil.equals(Krokodil2));
    }
}
