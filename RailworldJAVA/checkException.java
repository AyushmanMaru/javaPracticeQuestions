public class checkException extends RuntimeException {
    
    checkException(String msg){
        super(msg);
    }
}

class Main{
    public static void main(String aa[]){
        int age = 17;

        if(age<18){
           throw new checkException("you are not eligible for vote");
        }else{
            System.out.println("you are eligible for vote");
            
        }
    }
}
