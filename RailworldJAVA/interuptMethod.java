public class interuptMethod extends Thread {
    
    public void run(){

        try {
            
            Thread.sleep(1000);
            System.out.println("Hello");
        } catch (InterruptedException e) {
            throw new RuntimeException("Thread Interrupted"); 
        }

        System.out.println("I am Alive");
        
    }

    public static void main(String[] args) {
        
        interuptMethod in = new interuptMethod();
        interuptMethod in1 = new interuptMethod();
         in1.start();
        in.start();    
        
        in.interrupt();

        // try {
        //     in.interrupt();
        // } catch (Exception e) {
        //     System.out.println("Handled");
        // }
    }
}

