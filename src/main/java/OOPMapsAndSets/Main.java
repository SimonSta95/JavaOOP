package OOPMapsAndSets;

public class Main {
    public static void main(String[] args) {

        Pharmacy pharmacy = new Pharmacy();

        pharmacy.save(new Medication("Paracetamol", 5.10, 20));
        pharmacy.save(new Medication("Ibuprophen", 2.96, 12));
        pharmacy.save(new Medication("Asperin", 3.60, 100));

        System.out.println(pharmacy.getCount());
        System.out.println(pharmacy.findMedication("Asperin"));

        pharmacy.delete("Paracetamol");

        pharmacy.printStorage();


    }
}
