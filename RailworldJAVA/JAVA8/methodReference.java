package JAVA8;

import java.util.Arrays;
import java.util.List;

public class methodReference {
    
        static void data(String s){
            System.out.println(s);
    }

    public static void main(String[] args) {

        // methodReference mr = new methodReference();   //It will use if method is non-static

        List<String> number = Arrays.asList("One","Two","Three");

         number.forEach(methodReference::data);
        // number.forEach(mr::data);
    }
}
