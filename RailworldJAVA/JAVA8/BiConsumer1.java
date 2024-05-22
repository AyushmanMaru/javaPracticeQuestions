package JAVA8;

import java.util.function.BiConsumer;

public class BiConsumer1 {
    
    public static void main(String[] args) {
        
        BiConsumer<Integer,Integer> data = (x,y) -> {
            System.out.println(x+y);
        };

        data.accept(3, 5);

    }
}
