public class joinMethod extends Thread {
    
    public void run(){
        for(int i=1;i<=3;i++){
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        
    }

    public static void main(String[] args) {
        
        joinMethod jm = new joinMethod();
        joinMethod jm1 = new joinMethod();
        joinMethod jm2 = new joinMethod();

        jm.setName("Phle me chalunga");
        jm.start();

        try{
            jm.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        jm1.setName("Phir meri bare");
        jm2.setName("Phir meri bare");
        jm1.start();
        jm2.start();


    }
}
