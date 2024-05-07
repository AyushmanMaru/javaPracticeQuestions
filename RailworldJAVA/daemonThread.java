public class daemonThread extends Thread{
    
    public void run(){
        
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon Thread");
        }else{
            System.out.println("Hello World");
        }
    }

    public static void main(String aa[]){
        System.out.println("Parent thread");

        daemonThread dt = new daemonThread();
        dt.setDaemon(true);

        dt.start();

    }
}
