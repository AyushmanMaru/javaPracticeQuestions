package JAVA8;

public class lambdaWithThread  {
    
    public static void main(String[] args) {
        
        Runnable thread = () -> {

            for(int i=1;i<=5;i++){
                try {
                    Thread.sleep(500);
                    
                } catch (Exception e) {
                   e.printStackTrace();
                }
                System.out.println("Hello " + i);
            }
           
        };

        Thread th = new Thread(thread);
        th.run();
    }
}
