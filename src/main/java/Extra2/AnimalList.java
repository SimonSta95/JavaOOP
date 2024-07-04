package Extra2;

public class AnimalList {
    private AnimalListItem head;

    public void add(Animal a){
        AnimalListItem item = new AnimalListItem(a);
        if(head == null){
            head = item;
        } else {
            AnimalListItem current = head;
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(item);
        }
    }

    @Override
    public String toString() {
        return "AnimalList{" +
                "head=" + head.getValue().getAnimalName() + " -> " + head.getNext().getValue().getAnimalName() + " -> " + head.getNext().getNext().getValue().getAnimalName() +
                '}';
    }
}
