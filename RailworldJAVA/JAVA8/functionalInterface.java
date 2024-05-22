package JAVA8;


public interface functionalInterface {

    public void show();
} 
class Demo{                            
                                                // functional interface are those interface which have only one abstract Method
    public static void main(String[] args) {
        functionalInterface fi = ()-> System.out.println("Jaii Shree Ram");

        fi.show();
    }
}
