package FactoryMethod__AbstractFactoryDP;

public class AndroidDev implements Employee{

    public int salary() {
        return 50000;
    }

    public String name() {
        System.out.println("I m android dev ....");
        return "Android Dev";
    }

}
