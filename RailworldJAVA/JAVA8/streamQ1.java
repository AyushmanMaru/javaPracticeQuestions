package JAVA8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamQ1 {
    
    public static void main(String[] args) {
        
       List<Integer> list =  Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,1,2,3,4);

       List<Integer> filteredData = list.stream().filter(x -> x % 2==0)
       .map(x -> x*2)
       .distinct()
       .limit(3)
       .skip(1)
       .collect(Collectors.toList());

       System.out.println(filteredData);

       List<Integer> data = Stream.iterate(0,x->x+1)
       .limit(101)
       .filter(x -> x%2==0)
       .distinct()
       .sorted((a,b) -> b-a)
       .skip(1)
       .collect(Collectors.toList());
       System.out.println(data);

    //    List<Integer> mappedData = filteredData.stream().map(x -> x/2).collect(Collectors.toList());
    //    System.out.println(mappedData);




    }
}
