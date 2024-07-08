package OOPStatic;

public class Counter {

    static int totalCount = 0;
    int instanceCount = 0;

    public static void incrementTotalCount() {
        totalCount++;
    }

    public void incrementInstanceCount() {
        instanceCount++;
    }

    @Override
    public String toString() {
        return "instanceCount=" + instanceCount +
                " totalCount=" + totalCount;
    }
}
