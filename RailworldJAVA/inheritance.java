public class inheritance {
    void show(){
        System.out.println("show is running from parent");
    }
    void display(){
        System.out.println("Display is running from parent");
    }
}
class Child extends inheritance {
    void show(){
        System.out.println("Show is running from child");
    }

    public static void main(String aa[]){
        Child cd = new Child();
        cd.show();
        cd.display();
    }
}