package IlteratorDesignPattern;

import java.util.List;

public class MyIteratorImpl implements MyIterator {

    private List<User1> list;
    private int position = 0; 
    private int length;
    
    public MyIteratorImpl(List<User1> list) {
        this.list = list;
        this.length = list.size();
    }

    @Override
    public boolean hasNext() {
        if(position >= length)
            return false;
        else 
           return true;    
    }

    @Override
    public Object next() {
        User1 user = list.get(position);
        position += 1;
        return user;
    }

}
