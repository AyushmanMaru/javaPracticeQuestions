public class priorityMethod extends Thread {
    
    public void run(){
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("Hello");
        System.out.println(Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());

        priorityMethod pm = new priorityMethod();

        pm.setPriority(7+1);
        pm.start();
        
        
    }
}
