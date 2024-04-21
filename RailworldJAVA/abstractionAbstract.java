abstract class abstractionAbstract {
    abstract int interest();
}
class Sbi extends abstractionAbstract{
    int interest(){
        // System.out.println("interest is 10%");
        return 10;
    }
}
class Icici extends abstractionAbstract{
    int interest(){
        // System.out.println("interest is 9%");
        return 8;
    }
}
class Main{
    public static void main(String aa[]){
        abstractionAbstract ab = new Sbi();
       System.out.println(ab.interest()); 
    }
}
