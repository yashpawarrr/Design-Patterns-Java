package FactoryMethod__AbstractFactoryDP;

public class Client {

    public static void main(String[] args) {

        // i wanna A Android Dev
        Employee e1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
        e1.name();

        Employee e2 = EmployeeFactory.getEmployee(new WebDevFactory());
        e2.name();
    }
}
