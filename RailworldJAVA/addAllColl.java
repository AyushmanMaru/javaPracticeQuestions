import java.util.LinkedList;

public class addAllColl {
    
    public static void main(String[] args) {
        
        LinkedList<String> l = new LinkedList<>();
        LinkedList<String> l1 = new LinkedList<>();


        l.add("Ram");
        l.add("Kaam");
        l.add("Ravi");

        l1.add("111");
        l1.add("222");
        l1.add("333");

        l1.addAll(l);

        System.out.println(l1);
    }
}
