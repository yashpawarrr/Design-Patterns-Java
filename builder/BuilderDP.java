package builder;

public class BuilderDP {

    public static void main(String[] args) {

        User user = new User.UserBuilder()
                .setUserId("y@123.in")
                .setUserId("123")
                .setUserName("yash")
                .build();

        System.out.println(user);

        User cw = User.UserBuilder.builder().setUserName("cw").setUserId("122").setEmailId("hi@123").build();
    }
}
