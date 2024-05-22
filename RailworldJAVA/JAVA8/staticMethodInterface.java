package JAVA8;

public class staticMethodInterface {
    
    static void sayHello(){
        System.out.println("Helloo dostoo");
    }
} 
                                         //we cannot override static method in child 
class Child{
     public static void main(String[] args) {
        staticMethodInterface.sayHello();
     }
}
