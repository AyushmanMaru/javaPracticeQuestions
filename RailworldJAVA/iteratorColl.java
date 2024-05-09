import java.util.Iterator;
import java.util.LinkedList;



public class iteratorColl {
    

    public static void main(String[] args) {
        
        LinkedList<Integer> l = new LinkedList<>();

        // l.add("abc");
        // l.add("def");
        // l.add("ghi");

        for(int i=0;i<=5;i++){
            l.add(i+1);
        }

        Iterator<Integer> it = l.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
