public class exceptionHand {
    public static void main(String[] args) {
        try{
            int a = 10/0;
        }catch(ArithmeticException e){
            e.printStackTrace();
        }
    }
}
             


