package JAVA8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class predicateInt {
    
    public static void main(String[] args) {
                //Predicate is an Interface which have an test method which return an boolean value

        // Predicate<Integer>  startWithLetter = x -> x > 1000; 
        // System.out.println(startWithLetter.test(2000));

        // Predicate<String> startWithLetter = x -> x == "A";
        // System.out.println(startWithLetter.test("A"));

        Predicate<Integer> data = x -> x % 2 == 0;
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        for(int i:numbers){
            if(data.test(i)){
                System.out.println(i+" is Even");
            }
        }
        

        

        
    }
}
