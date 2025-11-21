package factoryDP;

public class EmployeeFactory {

    // Getting the employee
    public static Employee getEmployee(String empType) {
        if(empType.trim().equalsIgnoreCase("ANDROID DEV")) {
            return new AndroidDev();
        } else if (empType.trim().equalsIgnoreCase("WEB DEV")) {
            return new WebDev();
        } else {
            return null;
        }
    }
}
