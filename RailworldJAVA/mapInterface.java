import java.util.HashMap;
import java.util.Map;

public class mapInterface {
    
    public static void main(String[] args) {
        
        Map<Integer,String> map = new HashMap<>();
        Map<Integer,String> map1 = new HashMap<>();

        map1.put(101,"aaa");
        map1.put(102,"bbb");
        map1.put(103,"ccc");

        map.put(101,"Ayush");
        map.put(102,"Ravi");
        map.put(103,"Ram");

        System.out.println(map.get(102));
        System.out.println(map.containsKey(101));
        System.out.println(map.containsValue("hello"));
        System.out.println( map.size());
        System.out.println(map.entrySet());
        // map.remove(102);
        System.out.println(map.isEmpty());
        map.replace(101,"Ayushii");
        // map.putIfAbsent(104,"lavii");


        System.out.println(map);
        map.putAll(map1);
        System.out.println(map);

        System.out.println(map.getClass());

        



    }
}
