package BuilderDesignPattern;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
             .setEmailId("pragungandotra@gmail.com")
             .setUserName("pragun")
             .setUserId("112")
             .build();

        System.out.println(user);     
    }
}
