package JAVA8;

/**
 * lambdaExp
 */
public interface lambdaExp {

    public void add(int a,int b);
    
} 
class Test{
    public static void main(String[] args) {
        
        lambdaExp le = (int x,int y)-> System.out.println(x+y);

        le.add(10,20);
    }
}

