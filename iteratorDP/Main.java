package iteratorDP;

public class Main {
    public static void main(String[] args) {

        UserManagement userManagement = new UserManagement();

        userManagement.addUser(new User("y", "12"));
        userManagement.addUser(new User("k", "223"));
        userManagement.addUser(new User("m", "57"));
        userManagement.addUser(new User("j", "45"));

        MyIterator myIterator = userManagement.getIterator();
        while (myIterator.hasNext()) {

            User user = (User) myIterator.next();
            System.out.println(user.getName());
        }

    }
}
