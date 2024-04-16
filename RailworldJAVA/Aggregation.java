public class Aggregation {
    String name = "Ayush";
    int rollNum = 101;

    void data(){
        System.out.println(name+" "+rollNum);
    }
}
class Demo 
{
    public static void main(String aa[]){
        Aggregation ag = new Aggregation();
        ag.data();
    }
}

// class Demo{
//     int a = 10;
//     void data(){
//         int a = 20;
//         System.out.println(this.a);
//         System.out.println(a);
//     }
//     public static void main(String aa[]){
        
//         Demo d = new Demo();
//         d.data();
//     }
// }