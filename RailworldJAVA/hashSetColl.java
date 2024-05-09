import java.util.HashSet;

public class hashSetColl {
    
    public static void main(String[] args) {
         
        HashSet<String> hs = new HashSet<>();

        hs.add("abc");
        hs.add("def");
        hs.add("ghi");
        hs.add("def");         
  // In hashSet we caanot add duplicate Object, It doesnot follow Insertion order, It doesnot have index, It underline dataStructure is HashTable
  // It doesnot follow sorting order
        System.out.println(hs);
    }
}
