package factoryDP;

public class AndroidDev implements Employee{
    @Override
    public int salary() {
        System.out.println("Getting App dev salary");
        return 50000;
    }
}
