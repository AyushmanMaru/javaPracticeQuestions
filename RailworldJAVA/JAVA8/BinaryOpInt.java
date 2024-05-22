package JAVA8;

import java.util.function.BinaryOperator;

public class BinaryOpInt {
    
    public static void main(String[] args) {
        
        BinaryOperator<String> data = (str1,str2) -> str1 + str2;

                                                                    //It is used at the place of BiFunction if we want to provide same data type
        System.out.println(data.apply("Hello ", "World"));
    }
}
