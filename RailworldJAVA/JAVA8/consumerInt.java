package JAVA8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class consumerInt {
    
    public static void main(String[] args) {
        
        Consumer<List<Integer>> data = li -> {

            for(int i:li){
                System.out.println(i + 100);
            }
        };

        data.accept(Arrays.asList(1,2,3,4,5));
    }
}
