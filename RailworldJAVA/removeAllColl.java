import java.util.ArrayList;

public class removeAllColl {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        al.add(123);
        al.add(456);
        al.add(789);

        al2.add(789);
        al2.add(654);
        al2.add(123);

        // al.removeAll(al2);

        // System.out.println(al);
        // System.out.println(al2);

        al.retainAll(al2);               //Retain will print the common objects 
        System.out.println(al);
        
        // al2.removeAll(al);
        // System.out.println(al);   //removeAll will remove the common objects
        // System.out.println(al2);


    }
}
