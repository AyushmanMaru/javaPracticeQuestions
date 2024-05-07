import java.util.LinkedList;
public class linkedList1 {
    
    public static void main(String[] args) {
        
       LinkedList<String> l = new LinkedList<String>();
       LinkedList<String> l1 = new LinkedList<String>();
       LinkedList<String> l2 = new LinkedList<String>();

       l.add("ayush");
       l.add("vivek");
       l.add("jai");

       l1.add("Shiv");
       l1.add("krish");

       System.out.println(l);
       l.addFirst("navin");
       System.out.println(l);

       l.set(1,"Ravi");
       System.out.println(l);
    //    l.remove();
    //    System.out.println(l);
        // l.remove(3);
        // System.out.println(l);

        System.out.println(l.isEmpty());
        System.out.println(l.size());
        System.out.println(l.equals(l1));    //checking two collection object

        
        l2.addAll(l);
       System.out.println(l2);

       System.out.println(l.equals(l2));
       System.out.println(l.containsAll(l1));




        // l.clear();
        // System.out.println(l);

    }
}
