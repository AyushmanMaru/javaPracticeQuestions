public interface abInterface {

    void interest(int a);
    
}
class Sbi implements abInterface{
    public void interest(int a){
        System.out.println(a-2 + " %");
    }
}
class Axis implements abInterface{
    public void interest(int a){
        System.out.println(a-3 + " %");
    }
}
class Main{
    public static void main(String aa[]){
        abInterface ab = new Sbi();
        ab.interest(10);
        
    }
}
