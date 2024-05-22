package JAVA8;
import java.util.function.UnaryOperator;

public class unaryOPInt {
    
    public static void main(String[] args) {
        
        UnaryOperator<Integer> up = x -> x*x;
                                        //It is used if we want to give same data type in input or take output of same data type
        System.out.println(up.apply(5));
    }
}
