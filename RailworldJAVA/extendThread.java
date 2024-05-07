public class extendThread extends Thread {
    

   public void run(){
        System.out.println("THread is running from ExtendTread");
    }
}

class myThread extends Thread{
    public void run(){
        System.out.println("THread is running from myThread");
    }
}

class Main{
    public static void main(String aa[]){
        extendThread t1 = new extendThread();
        t1.start();
        myThread t2 = new myThread();
        t2.start();
    }
}
