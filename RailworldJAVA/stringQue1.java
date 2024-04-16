import java.util.StringTokenizer;

public class stringQue1 {
    public static void main(String aa[]){
        String data = "Hello.World.Byee";

        StringTokenizer st = new StringTokenizer(data,".");
    
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
   
}
