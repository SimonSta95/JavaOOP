package OOPStatic;

public class Main {

    public static void main(String[] args) {

        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();

        counter1.incrementInstanceCount();
        counter1.incrementTotalCount();
        counter2.incrementInstanceCount();
        Counter.incrementTotalCount();
        counter3.incrementInstanceCount();
        counter3.incrementTotalCount();

        System.out.println(counter1);
        System.out.println(counter2);
        System.out.println(counter3);


        //Bonus
        System.out.println(Calculator.add(15,30));
        System.out.println(Calculator.subtract(15,30));
        System.out.println(Calculator.multiply(15,30));
        System.out.println(Calculator.divide(30,15));




    }
}
