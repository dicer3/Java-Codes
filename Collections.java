import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class Collections {
    public static void main(String[] args) {
        int[] arr = new int[]{5,11,17,12,31}; 
        for(int i:arr){
            System.out.println(i);
        }

        List<String> listStr = new ArrayList<>();
        listStr.add("nice");
        listStr.add("pragun");
        listStr.add("pragun 2");

        for(String str : listStr){
            System.out.println(str);
        }

        System.out.println("++++++++");

        Iterator<String> itr = listStr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("#######");

        ListIterator<String> listIterator1 = listStr.listIterator(listStr.size());
        while (listIterator1.hasNext()) {
            System.out.println(listIterator1.next());
        }

        System.out.println("++++++++");
        
        ListIterator<String> listIterator2 = listStr.listIterator(listStr.size());
        while (listIterator2.hasPrevious()) {
            System.out.println(listIterator2.previous());
        }
    }
}
