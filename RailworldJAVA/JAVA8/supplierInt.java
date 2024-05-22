package JAVA8;

import java.util.function.Supplier;

public class supplierInt {
    
    public static void main(String[] args) {
        
        Supplier<Integer> supplier = () -> 10;

        System.out.println(supplier.get());
    }
}
