import java.util.ArrayList;

public class arrayList1 {
    
    public static void main(String aa[]){
        
        ArrayList<String> al = new ArrayList<String>();

        al.add("My");
        al.add("Name");
        al.add("is");
        al.add("Ayushman");

        System.out.println(al);
        al.set(3,"Ayushi");
        System.out.println(al);
        al.remove(1);
        System.out.println(al);
        // al.clear();
        // System.out.println(al);
       
        System.out.println( al.contains("Ayushi"));


        // for(String s : al){
        //     System.out.println(s);
        // }
    }
}
