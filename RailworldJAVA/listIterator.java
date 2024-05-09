import java.util.LinkedList;
import java.util.ListIterator;

public class listIterator {
    
    public static void main(String[] args) {
        
        LinkedList<Integer> l = new LinkedList<>();

        l.add(111);
        l.add(222);
        l.add(null);
        l.add(333);

        ListIterator<Integer> li = l.listIterator();

        System.out.println("retriving data in forward direction");
        while(li.hasNext()){
            System.out.println(li.next());
        }

        System.out.println("retriving data in backward direction");
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
}
