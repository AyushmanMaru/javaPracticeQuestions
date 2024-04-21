public class wrapperInt {
    
    public static void main(String aa[]){
        int a = 20;
        //Autoboxing
        Integer i = a;       
        Integer j = Integer.valueOf(a);   
        System.out.println(a+" "+i+" "+j);   //compiler will write internally  
    }
}
