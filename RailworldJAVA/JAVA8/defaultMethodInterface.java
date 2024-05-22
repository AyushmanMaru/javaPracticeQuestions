package JAVA8;

 interface defaultMethodInterface1 {

    default void start(){
        System.out.println("Method is Running from parent1..................");
    }
} 

interface Demo{
    default void start(){
        System.out.println("Method is Running from parent2..................");
    }
}

class defaultMethodInterface implements defaultMethodInterface1,Demo{
    public static void main(String[] args) {
        defaultMethodInterface m = new defaultMethodInterface();
        m.start();
    }

    public void start(){
        Demo.super.start();
    }
}
