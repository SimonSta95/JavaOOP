package OOPMapsAndSets;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {

    private Map<String,Medication> storage;

    public Pharmacy() {
        this.storage = new HashMap<>();

    }
    public int getCount(){
        return storage.size();
    }

    public void save(Medication medication){
        storage.put(medication.getName(), medication);
    }

    public Medication findMedication(String name){

        if(storage.containsKey(name)) {
            return storage.get(name);
        }

        return null;
    }

    public void delete(String name){
        storage.remove(name);
    }

    public void printStorage(){
        System.out.println("Items in storrage: ");
        for(Map.Entry<String,Medication> entry : storage.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
    }


}
