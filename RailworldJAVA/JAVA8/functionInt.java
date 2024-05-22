package JAVA8;

import java.util.function.Function;

public class functionInt {
    
    public static void main(String[] args) {
        
        // Function<String,Integer> data = s -> s.length();
        // System.out.println(data.apply("Ayushman"));

        Function<Integer,Integer> data = x -> x*x;
        System.err.println(data.apply(5));
    }
}
