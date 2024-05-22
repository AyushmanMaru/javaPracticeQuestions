package JAVA8;

import java.util.function.Function;

public class functionChaining {
    
    public static void main(String[] args) {

        Function<Integer,Integer> data = x -> 2*x;
        Function<Integer,Integer> data1 = x -> x*x*x;

        System.out.println(data.andThen(data1).apply(5));        //andThen method will make function inside a Function
        System.out.println(data1.andThen(data).apply(5));

        System.out.println(data.compose(data1).apply(5));         //It will work same as data1.andThen(data)

        
        }
}
