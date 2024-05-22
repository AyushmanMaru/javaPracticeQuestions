package JAVA8;

import java.util.function.BiFunction;

public class BiFunction1 {
    
    public static void main(String[] args) {
        BiFunction<String,String,Integer> data = (str,str1) -> str.length() + str1.length();

        System.out.println(data.apply("Ayush","Hello"));
    }
}
