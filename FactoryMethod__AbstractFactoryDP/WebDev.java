package FactoryMethod__AbstractFactoryDP;

public class WebDev implements Employee{

    public int salary() {
        return 55000;
    }

    public String name() {
        System.out.println("I m web dev ....");
        return "Web Dev";
    }
}
