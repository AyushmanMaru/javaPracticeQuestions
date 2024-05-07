import java.util.LinkedList;
public class linkedList1 {
    
    public static void main(String[] args) {
        
       LinkedList<String> l = new LinkedList<String>();

       l.add("ayush");
       l.add("vivek");
       l.add("jai");

       System.out.println(l);
       l.addFirst("navin");
       System.out.println(l);

       l.set(1,"Ravi");
       System.out.println(l);
    //    l.remove();
    //    System.out.println(l);
        l.remove(3);
        System.out.println(l);

        System.out.println(l.isEmpty());

        l.clear();
        System.out.println(l);

    }
}
