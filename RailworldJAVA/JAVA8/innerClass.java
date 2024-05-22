package JAVA8;

interface innerClass {
    
    String employee();

    int salary();
}
class Main1{
    public static void main(String[] args) {
        innerClass in = new innerClass() {
            
            public String employee(){
                return "Ayush";
            }

            public int salary(){
                return 500000;
            }
        };

        System.out.println(in.employee());
        System.out.println(in.salary()+ " per Month");
    }
}
