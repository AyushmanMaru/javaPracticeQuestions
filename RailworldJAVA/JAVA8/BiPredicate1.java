package JAVA8;

import java.util.function.*;
public class BiPredicate1 {
    
    public static void main(String[] args) {

        BiPredicate<String,Integer> data = (str,y) -> str.length() == y;

        System.out.println(data.test("Ayush", 6));
    }
}
