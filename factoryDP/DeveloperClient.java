package factoryDP;

public class DeveloperClient {

    public static void main(String[] args) {

        // No Need of that > Tight Coupling
//        Employee employee = new AndroidDev();

        Employee employee = EmployeeFactory.getEmployee("ANDROID DEV");
        employee.salary();
    }
}
