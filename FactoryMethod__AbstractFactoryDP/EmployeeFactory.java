package FactoryMethod__AbstractFactoryDP;

public class EmployeeFactory {

    // get employee >
    // this method dont know what to do >

    // > we're gonna provide another interface || abstract class >

    public static Employee getEmployee(EmployeeAbstractFactory factory) {
        return factory.createEmployee();
    }
}
