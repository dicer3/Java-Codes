package java8;

import java.sql.Date;
import java.util.function.Supplier;

public class SupplierDemo {
    
    public Date fetchCurrentDate(){
       return new Date(7);
    }
    public static void main(String[] args) {
        SupplierDemo ob = new SupplierDemo();
        System.out.println("this "+ob.fetchCurrentDate());

        Supplier<Date> currentDate = () -> new Date(120);
        System.out.println("this 2 "+currentDate.get());
    }

}
