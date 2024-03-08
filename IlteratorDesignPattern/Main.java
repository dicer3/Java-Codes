package IlteratorDesignPattern;

public class Main {
    public static void main(String[] args) {
        UserManagment userManagment = new UserManagment();

        userManagment.addUser(new User1("durgesh", "14"));
        userManagment.addUser(new User1("harh", "14"));
        userManagment.addUser(new User1("durgesh", "14"));
        userManagment.addUser(new User1("durgesh2", "14"));

        MyIterator myIterator = userManagment.getIterator();
        while (myIterator.hasNext()) {
            User1 user = (User1) myIterator.next();
            System.out.println("user "+user.getName());
            
        }
    }
}
