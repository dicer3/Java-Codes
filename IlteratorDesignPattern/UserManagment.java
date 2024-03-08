package IlteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;


public class UserManagment {
    private List<User1> userList = new ArrayList<>();

    public void addUser(User1 user){
        userList.add(user);
    }

    public User1 getUser(int index){
        return userList.get(index);
    }

    public MyIterator getIterator(){
        return new MyIteratorImpl(userList);
    }
}
